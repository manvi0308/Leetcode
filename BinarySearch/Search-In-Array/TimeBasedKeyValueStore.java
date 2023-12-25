import java.util.*;

public class TimeBasedKeyValueStore {
    private HashMap<String, TreeMap<Integer, String>> hMap;

    public TimeBasedKeyValueStore() {
        hMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        hMap.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);

    }

    public String get(String key, int timestamp) {
        if (!hMap.containsKey(key)) {
            return "";
        }

        TreeMap<Integer, String> tMap = hMap.get(key);
        Integer floorTimeStamp = tMap.floorKey(timestamp);
        return (floorTimeStamp == null) ? "" : tMap.get(floorTimeStamp);
    }
}
