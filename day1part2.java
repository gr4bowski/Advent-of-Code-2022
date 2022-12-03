import java.util.Scanner;

public class day1part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Elf = 1, carryingElf = 0;
        int mostCalories = 0, lastLine = 0, secondMost = 0, thirdMost = 0;
        while (true) {
            int nextCalories = 0;
            String line = scanner.nextLine();
//            if (line.length() != 0) {
                while (line.length() != 0) {
                    nextCalories += Integer.valueOf(line);
                    line = scanner.nextLine();
                    lastLine = 0;
//                }
//            } else {
            }
            lastLine++;
            Elf++;
            if (nextCalories > mostCalories) {
                carryingElf = Elf;
                // int temp = mostCalories;
                mostCalories = nextCalories;
            } else if (nextCalories > secondMost) {
                if (secondMost > thirdMost) {
                    thirdMost = secondMost;
                }
                secondMost = mostCalories;
            } else if (nextCalories > thirdMost) {
                thirdMost = nextCalories;
            }
            if (lastLine > 1) {
                break;
            }
        }
        System.out.println("Elf number: " + carryingElf + " is carrying the most calories - " + mostCalories);
        int topThree = mostCalories + secondMost + thirdMost;
        System.out.println("Top three Elves are carrying "+topThree +" in total!");
    }
}