package String_Level3;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players (x): ");
        int players = scanner.nextInt();
        System.out.print("Enter number of cards per player (n): ");
        int cardsPerPlayer = scanner.nextInt();

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards in the deck to distribute.");
            scanner.close();
            return;
        }

        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributedCards);

        scanner.close();
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int numOfCards = deck.length;
        for (int i = 0; i < numOfCards; i++) {
            int randomCardNumber = i + (int) (Math.random() * (numOfCards - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] playersCards = new String[players][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < players; j++) {
                playersCards[j][i] = deck[deckIndex];
                deckIndex++;
            }
        }
        return playersCards;
    }

    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + "'s Hand: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print("[" + playersCards[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
