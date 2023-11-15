package org.example;
import java.util.HashMap;

public class Task {

    public static int[] highestAbsolutePair(int[] tab) {
        HashMap<Integer, int[]> map = new HashMap<>();

        int max = 0;
        boolean containsPair = false;
        for (int num: tab) {
            int value = Math.abs(num);

            map.computeIfAbsent(value, k -> new int[]{num, 0});
            if (map.containsKey(value) && map.get(value)[0]*num < 0) {
                containsPair = true;
                max = Math.max(max, value);
                map.get(value)[1] = num;
            }
        }

        return containsPair ? map.get(max) : null;
    }
}