public class RemoveDuplicates {
    static int removeDuplicate(int[] arr){
        // Initial configuration
        int curr = arr[0];
        int index = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != curr){
                curr = arr[i];
                arr[index] = curr;
                index++;
            }
        }

        return index;
    }
}
