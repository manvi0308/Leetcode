package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Helper {
    public static void main(String[] args) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        System.out.println(map); // {}
        map.put(1, new TreeMap<>());
        System.out.println(map); //{1= {}} 
        map.put(1, (3,  new PriorityQueue<>()));

    }
}
