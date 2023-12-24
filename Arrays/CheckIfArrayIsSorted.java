public class CheckIfArrayIsSorted {
    public static boolean checkSorted(int[] arr, int n){
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1])
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5};
        System.out.println(checkSorted(arr, arr.length));
    }
}
