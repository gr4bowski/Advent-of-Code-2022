import java.util.*;

public class day6part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int startOfPacketMarker;
        while (!nextLine.isEmpty()) {
            int n = 0;
            while (true) {
                Set<Character> startOfPacket = new HashSet<>();
                for (int i = 0; i < 14; i++) {
                    Character toList = nextLine.charAt(i+n);
                    startOfPacket.add(toList);
                }
                if (startOfPacket.size() == 14) {
                    startOfPacketMarker = n + 14;
                    break;
                } else {
                    n++;
                }
            }
            System.out.println(startOfPacketMarker);
            nextLine = scanner.nextLine();
        }
    }
}
