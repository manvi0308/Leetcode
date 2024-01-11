package Sheet.Sort0s1s2s;

public class Better {
    static void sort012(int[] arr) {
        int ct0 = 0, ct1 = 0, ct2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ct0++;
            }

            else if (arr[i] == 1) {
                ct1++;
            }

            else {
                ct2++;
            }
        }

        for (int i = 0; i < ct0; i++)
            arr[i] = 0;

        for (int i = ct0; i < ct0 + ct1; i++)
            arr[i] = 1;// replacing 1's

        for (int i = ct0 + ct1; i < arr.length; i++)
            arr[i] = 2; // replacing 2's

    }
}
