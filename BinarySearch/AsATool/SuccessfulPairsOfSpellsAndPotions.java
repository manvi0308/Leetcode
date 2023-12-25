package BinarySearch.AsATool;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            res[i] = potions.length - firstSuccessIndex(spells[i], potions, success);
        }
        return res;
    }

    public int firstSuccessIndex(int spell, int[] potions, long success) {
        int l = 0;
        int r = potions.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if ((long) spell * potions[m] >= success) {
                r = m;
            }

            else
                l = m + 1;
        }

        return l;
    }
}
