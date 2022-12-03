import java.util.Scanner;

public class day1part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mostCalories = 0, currentCalories = 0, emptyLines = 0;
        while (emptyLines <= 1) {
            String nextLine = scanner.nextLine();
            if (!nextLine.isEmpty()) {
                currentCalories += Integer.valueOf(nextLine);
                emptyLines = 0;
            } else {
                if (currentCalories > mostCalories) {
                    mostCalories = currentCalories;
                }
                currentCalories = 0;
                emptyLines++;
            }
        }
        System.out.println(mostCalories);
    }
}
