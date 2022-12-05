import java.util.LinkedList;
import java.util.Scanner;

public class day5part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine;
        LinkedList[] stacks = new LinkedList[9];
        LinkedList<Character> stack1 = new LinkedList<>();
        stacks[0] = stack1;
        LinkedList<Character> stack2 = new LinkedList<>();
        stacks[1] = stack2;
        LinkedList<Character> stack3 = new LinkedList<>();
        stacks[2] = stack3;
        LinkedList<Character> stack4 = new LinkedList<>();
        stacks[3] = stack4;
        LinkedList<Character> stack5 = new LinkedList<>();
        stacks[4] = stack5;
        LinkedList<Character> stack6 = new LinkedList<>();
        stacks[5] = stack6;
        LinkedList<Character> stack7 = new LinkedList<>();
        stacks[6] = stack7;
        LinkedList<Character> stack8 = new LinkedList<>();
        stacks[7] = stack8;
        LinkedList<Character> stack9 = new LinkedList<>();
        stacks[8] = stack9;
        for (int level = 0; level < 8; level++){
            nextLine = scanner.nextLine();
            for (int n = 0; n < 9; n++) {
                int barrelIndex = (4 * n) + 1;
                if (!(nextLine.charAt(barrelIndex) == ' ')) {
                    Character barrel = nextLine.charAt(barrelIndex);
                    stacks[n].addLast(barrel);
                }
            }
        }
        for (int test = 0; test < 9; test++) {
            System.out.println(stacks[test]);
        }
        System.out.println("Orders:");
        do {
            nextLine = scanner.nextLine();
            if (!nextLine.isEmpty()) {
                nextLine = nextLine.replaceAll("[^0-9]", " ");
                nextLine = nextLine.replaceAll(" +", " ");
                String[] nextLineS = nextLine.split(" ");
                int x = Integer.parseInt(nextLineS[1]);
                int y = Integer.parseInt(nextLineS[2])-1;
                int z = Integer.parseInt(nextLineS[3])-1;
                for (int i = 0; i < x; i++) {
                    if (!stacks[y].isEmpty()) {
                        Object toBeMoved = stacks[y].getFirst();
                        stacks[z].addFirst(toBeMoved);
                        stacks[y].removeFirst();
                    }
                }

            } else {
                break;
            }
        } while (true);
        for (int top = 0; top < 9; top++) {
            if (!stacks[top].isEmpty()) {
                Character atTop = (Character) stacks[top].getFirst();
                System.out.print(atTop);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
