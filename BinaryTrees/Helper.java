package BinaryTrees;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Helper {
    public static void main(String[] args) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        System.out.println(map); // {}
        map.put(1, new TreeMap<>());
        System.out.println(map); // {1= {}}
        map.get(1).put(1, new PriorityQueue<>());
        System.out.println(map); // {1={1=[]}}

        map.get(1).get(1).add(4);
        map.get(1).get(1).add(3);
        map.get(1).get(1).add(5);
        map.get(1).get(1).add(2);

        map.put(2, new TreeMap<>());
        map.get(2).put(1, new PriorityQueue<>());
        map.get(2).get(1).add(4);
        map.get(2).get(1).add(3);
        map.get(2).get(1).add(5);
        map.get(2).get(1).add(2);

        System.out.println(map); // {1={1=[2, 3, 5, 4]}, 2={1=[2, 3, 5, 4]}}
    }
}
