public class MoveNegToOneSide {
    public void segregateElements(int[] arr, int n) {
        /*
         * Input :
         * N=8
         * arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
         * Output :
         * 7 9 10 11 -5 -3 -4 -1
         */

         int left = 0;
         int right = n - 1;

         while (left <= right) {
            /*
             * left     right       Sol
             * +        +           left++
             * +        -           left++  right--
             * -        +           swap
             * -        -           right--
             */

            if(arr[left] > 0 && arr[right] > 0){
                left++;
            }
            else if(arr[left] > 0 && arr[right] < 0){
                left++;
                right--;
            }
            else if(arr[left] < 0 && arr[right] > 0){
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            else{
                right--;
            }
         }
    }
}
