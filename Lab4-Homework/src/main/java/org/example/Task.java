package org.example;
import java.util.HashMap;

public class Task {

    public static int[] highestAbsolutePair(int[] tab) {
        HashMap<Integer, int[]> map = new HashMap<>();

        int max = 0;
        boolean containsPair = false;
        for (int i=0; i<tab.length; i++) {
            int value = Math.abs(tab[i]);

            if (!map.containsKey(value)) {
                map.put(value, new int[]{tab[i], 0});
            } else if (map.get(value)[0]*tab[i] < 0) {
                containsPair = true;
                if (value > max) {
                    max = value;
                }
                map.get(value)[1] = tab[i];
            }
        }

        if (containsPair) {
            return map.get(max);
        }

        return null;
    }
}