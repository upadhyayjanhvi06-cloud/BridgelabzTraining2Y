
import java.util.*;

public class Problem1 {

    static class Item {
        String name;
        int size;
        boolean isFile;
        List<Item> children = new ArrayList<>();

        Item(String name, int size, boolean isFile) {
            this.name = name;
            this.size = size;
            this.isFile = isFile;
        }
    }

    // (a) Recursive function
    static int getDirectorySize(Item item, Set<String> visited) {

        // Base case: item is a file
        if (item.isFile) {
            return item.size;
        }

        // Handle cycles
        if (visited.contains(item.name)) {
            return 0;
        }
        visited.add(item.name);

        // Recursive case: calculate child sizes
        int totalSize = 0;

        for (Item child : item.children) {
            totalSize += getDirectorySize(child, visited);
        }

        return totalSize;
    }

    // (d) Iterative approach using a stack
    static int getDirectorySizeIterative(Item root) {
        Stack<Item> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        int totalSize = 0;

        stack.push(root);

        while (!stack.isEmpty()) {
            Item item = stack.pop();

            if (item.isFile) {
                totalSize += item.size;
            } else {
                if (visited.contains(item.name)) {
                    continue;
                }
                visited.add(item.name);

                for (Item child : item.children) {
                    stack.push(child);
                }
            }
        }

        return totalSize;
    }

    public static void main(String[] args) {

        Item project = new Item("project", 0, false);

        Item src = new Item("src", 0, false);
        src.children.add(new Item("main.java", 100, true));
        src.children.add(new Item("utils.java", 50, true));

        Item docs = new Item("docs", 0, false);
        docs.children.add(new Item("readme.txt", 10, true));

        Item guides = new Item("guides", 0, false);
        guides.children.add(new Item("setup.pdf", 200, true));
        docs.children.add(guides);

        project.children.add(src);
        project.children.add(docs);
        project.children.add(new Item("config.xml", 20, true));

        System.out.println("Recursive total: "
                + getDirectorySize(project, new HashSet<>()) + " KB");

        System.out.println("Iterative total: "
                + getDirectorySizeIterative(project) + " KB");
    }
}
