public class RemoveDuplicates {
    static int removeDuplicate(int[] arr){
        //^ Intution is since its a sorted array, so the duplicate element will
        //^ be at adjacent positions only.

        //& Initial configuration
        int curr = arr[0];
        int index = 1;

        //*  Say the most recent unique element is curr, if arr[i] is not same as curr, means arr[i] is not
        //* duplicate and will have its occurence, so we have to place it. Make a variable index that will all 
        //* the times point to the index where the next non-duplicate element will be stored. 
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
