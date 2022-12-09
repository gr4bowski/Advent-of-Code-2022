import java.util.*;
public class Directory {

    List<Integer> filesInside;
    List<Directory> dirInside;
    Integer size;
    Directory parent;
    String name;
    Directory(String name, Directory parent) {
        this.parent = parent;
        this.filesInside = new ArrayList<>();
        this.dirInside = new ArrayList<>();
        this.name = name;
        this.size = 0;
    }

    public Integer calculateMySize() {
        for(Integer it : this.filesInside)
            this.size+=it;
        for(Directory it : this.dirInside)
            this.size += it.calculateMySize();
        return this.size;
    }
    public void addDir(Directory toAdd) {
        this.dirInside.add(toAdd);
    }
    public Integer sumOfDirInside() {
        int sum = 0;
        if (this.size <= 100000)
            sum += this.size;
        for (Directory it: this.dirInside) {
            sum += it.sumOfDirInside();
        }
        return sum;
    }
    public static Set<Directory> findBigEnough(int value, Directory dir) {
        Set<Directory> result = new HashSet<>();
        if (dir.size > value) {
            result.add(dir);
        }
        if (!dir.dirInside.isEmpty()){
            for (Directory it : dir.dirInside) {
                result.addAll(findBigEnough(value, it));
            }
        }
        return result;
    }
}

public class day7part1v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory root = new Directory("/", null);
        Directory currentDirectory;
        currentDirectory = root;
        String nextLine = scanner.nextLine();
        while (!nextLine.isEmpty()) {
            String[] command = nextLine.split(" ");
            if (command[0].equals("$")) {
                if (command[1].equals("cd")) {
                    if (command[2].equals("..")) {
                        currentDirectory = currentDirectory.parent;
                    } else { //cd dir.name
                        String name = command[2];
                        for (Directory it : currentDirectory.dirInside) {
                            if (it.name.equals(name)) {
                                currentDirectory = it;
                            }
                        }
                    }
                }
            } else if (command[0].equals("dir")) {
                currentDirectory.addDir(new Directory(command[1], currentDirectory));
            } else {
                Integer newFile = Integer.parseInt(command[0]);
                currentDirectory.filesInside.add(newFile);
            }
            nextLine = scanner.nextLine();
        }
        root.calculateMySize();
        System.out.println(root.sumOfDirInside());
        int toFree = 30000000 - (70000000 - root.size);
        int smallest = root.size;
        for (Directory it : Directory.findBigEnough(toFree, root)) {
            if (it.size < smallest)
                smallest = it.size;
        }
        System.out.println(smallest);
    }
}
