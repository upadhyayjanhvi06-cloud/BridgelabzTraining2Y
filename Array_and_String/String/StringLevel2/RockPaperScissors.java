package StringLevel2;
import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors"))
                || (user.equals("Paper") && computer.equals("Rock"))
                || (user.equals("Scissors") && computer.equals("Paper"))) {

            return "User";
        }

        return "Computer";
    }

    static double[] calculateStats(int userWins, int computerWins, int games) {

        double userPercentage =
                ((double) userWins / games) * 100;

        double computerPercentage =
                ((double) computerWins / games) * 100;

        return new double[]{
                userPercentage,
                computerPercentage
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        String[][] results = new String[games][3];

        for (int i = 0; i < games; i++) {

            System.out.print(
                    "\nGame " + (i + 1)
                    + " - Enter Rock/Paper/Scissors: "
            );

            String user = sc.next();

            // Normalize input
            user = user.substring(0, 1).toUpperCase()
                    + user.substring(1).toLowerCase();

            String computer = computerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");

        for (int i = 0; i < games; i++) {

            System.out.println(
                    (i + 1) + "\t"
                    + results[i][0] + "\t"
                    + results[i][1] + "\t\t"
                    + results[i][2]
            );
        }

        double[] stats =
                calculateStats(userWins, computerWins, games);

        System.out.println("\nUser Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        System.out.println(
                "User Win Percentage: " + stats[0] + "%"
        );

        System.out.println(
                "Computer Win Percentage: " + stats[1] + "%"
        );
    }
}
