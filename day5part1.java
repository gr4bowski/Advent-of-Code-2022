import java.util.LinkedList;
import java.util.Scanner;

public class day5part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList[] stacks = new LinkedList[8];
        LinkedList stack = new LinkedList<>();

        for (int level = 0; level < 8; level++){
            String nextLine = scanner.nextLine();
            for (int n = 0; n < 8; n++) {
                int barrelIndex = (4 * n) + 1;
                if (level == 0) {
                    stacks[n] = stack;
                }
                if (!(nextLine.charAt(barrelIndex) == ' ')) {
                    Character barrel = nextLine.charAt(barrelIndex);
                    stack = stacks[n];
                    stack.addLast(barrel);
                    stacks[n] = stack;
                }
            }

        }
        for (int x = 0; x < 8; x++) {
            System.out.println(stacks[x]);
        }
    }
}
