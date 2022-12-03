import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.length() == 0) {
                break;
            }
            char oponent = nextLine.charAt(0);
            char you = nextLine.charAt(2);
            if (you == 'X') {
                score += 1;
                if (oponent == 'A') {
                    score += 3;
                } else if (oponent == 'C') {
                    score += 6;
                }
            } else if (you == 'Y') {
                score += 2;
                if (oponent == 'A') {
                    score += 6;
                } else if (oponent == 'B') {
                    score += 3;
                }
            } else if (you == 'Z') {
                score += 3;
                if (oponent == 'B') {
                    score += 6;
                } else if (oponent == 'C') {
                    score += 3;
                }
            }
        }
        System.out.println(score);
    }
}
