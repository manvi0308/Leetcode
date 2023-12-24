public class CylindricalRotationByOne {
    public void rotate(int arr[], int n)
    {   
        /*
         * Input 1, 2, 3, 4, 5
         * Output 5, 1, 2, 3, 4
         */
        int last = arr[n -1];

        for(int i =n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

}
