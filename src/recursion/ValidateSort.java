package recursion;

import java.util.Arrays;

//IF PROGRAM RETURNS 1 THEN SORTED OTHERWISE -1(NOT SORTED)
public class ValidateSort {

    public static void main(String[] args) {
        boolean IsIncSort= false;
//        int arr[] = {1,2,3,4,5,6};
        int arr[] = {90,54,1};

        if(arr.length == 1){
            return;
        }
        if(arr[0] < arr[arr.length-1]) {
            IsIncSort = true;
        }
        System.out.println(checkSort(arr, 0, 1,IsIncSort));
    }

    public static int checkSort(int[] arr, int l, int r, boolean IsIncSort){
        //base condition
        if(l == arr.length-1 || r== arr.length){
            return 1;
        }
        //base condition for ascending order
        if(IsIncSort && arr[l] > arr[r]){
            return -1;
        }
        //base condition for descending order
        if(!IsIncSort && arr[l] < arr[r]){
            return -1;
        }
        return checkSort(arr,l+1, r+1,IsIncSort);
    }
}
