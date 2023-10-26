import java.util.Scanner;

public class FriendshipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first person's name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter the second person's name:");
        String name2 = scanner.nextLine();

        String yearsOfFriendship = calculateFriendshipYears(name1, name2);

        System.out.println("Years of friendship: " + yearsOfFriendship);
    }

    public static String calculateFriendshipYears(String name1, String name2) {
        // Convert names to lowercase for case-insensitive matching
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        int commonLetterCount = 0;

        // Count common letters
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (name1.contains(String.valueOf(letter)) && name2.contains(String.valueOf(letter))) {
                commonLetterCount++;
            }
        }

        // Determine years of friendship based on common letter count
        if (commonLetterCount < 2) {
            return "2";
        } else if (commonLetterCount >= 2 && commonLetterCount < 5) {
            return "10";
        } else {
            return "15";
        }
    }
}
