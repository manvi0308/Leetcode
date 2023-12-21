package  Stacks;

import java.util.Arrays;

public class SimplifyPath {
    public static void simplifyPath(String path) {
        String[] parts = path.split("/");
          System.out.println(Arrays.toString(parts));
        //    System.out.println(parts.length);
            System.out.println(parts[0].length());
    }

    public static void main(String[] args) {
        String path = "/home////foo/";
        simplifyPath(path);

    }
}