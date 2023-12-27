public class LinearSearch{
    static void linearSearch(int[] arr, int n){
        // search for n in arr

        for(int i = 0; i < n; i++){
            if(arr[i] == n){
                System.out.println("Element found at  " + i + " index");
                return;
            }
        }

        System.out.println("Not found");
    }
}