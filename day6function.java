import java.util.*;

public class day6function {
    static int marker(String line, int length) {
        int n = 0;
        if (length > line.length()) {
            throw new RuntimeException("Unique sequence can't be longer than given string");
        }
        while (n + length <= line.length()) {
            Set<Character> uniqueSequence = new HashSet<>();
            for (int i = 0; i < length; i++) {
                uniqueSequence.add(line.charAt(i+n));
            }
            if (uniqueSequence.size() == length) {
                return(n + length);
            } else {
                n++;
            }
        }
        return(-1);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unique sequence length:");
        int length = scanner.nextInt();
        System.out.println("String to be analyzed:");
        String nextLine = scanner.nextLine();
        while (nextLine.isEmpty()) {
            nextLine = scanner.nextLine();
        }
        System.out.println(marker(nextLine,length));
    }
}
