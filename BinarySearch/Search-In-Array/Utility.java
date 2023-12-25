import java.util.Arrays;
import java.util.TreeMap;

public class Utility {
    public static void main(String[] args) {
        TreeMap<Integer, Integer>[] snapshotArray = new TreeMap[5];
        System.out.println(Arrays.toString(snapshotArray)); // [null, null, null, null, null]
        for (int i = 0; i < 5; i++) {
            snapshotArray[i] = new TreeMap<>();

        }
        System.out.println(Arrays.toString(snapshotArray)); // [{}, {}, {}, {}, {}]
        snapshotArray[0].put(1, 2);
        snapshotArray[0].put(1, 3);
        snapshotArray[0].put(1, 4);

        System.out.println(Arrays.toString(snapshotArray));

    }
}
