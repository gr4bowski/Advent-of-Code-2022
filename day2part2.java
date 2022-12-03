import java.util.Scanner;

public class day2part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.length() > 0) {
            char oponent = nextLine.charAt(0);
            char strategy = nextLine.charAt(2);
            if (oponent == 'A') {
                if (strategy == 'X') {
                    score += 3;
                } else if (strategy == 'Y') {
                    score += 4;
                } else if (strategy == 'Z') {
                    score += 8;
                }
            } else if (oponent == 'B') {
                if (strategy == 'X') {
                    score +=1;
                } else if (strategy == 'Y') {
                    score +=5;
                } else if (strategy == 'Z') {
                    score +=9;
                }
            } else if (oponent == 'C'){
                if (strategy == 'X') {
                    score +=2;
                } else if (strategy == 'Y') {
                    score +=6;
                } else if (strategy == 'Z') {
                    score += 7;
                }
                }
            } else {
                System.out.println(score);
                break;
            }
        }
    }
}
// Points:

// A - Rock = 1p
// B - Paper = 2p
// C - Scissors = 3p

// X - Lose = 0p
// Y - Draw = 3p
// Z - Win = 6p