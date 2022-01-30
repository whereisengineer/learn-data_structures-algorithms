package arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};

        int lastPos = array.length - 1;

        for (int i=0 ;i<array.length; i++){
            if(i<lastPos){
                swapElements(array,i, lastPos);
                lastPos--;
            }
        }

        for (int i=0 ;i<array.length; i++){
            System.out.println(array[i] + " ");
        }

    }

    private static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
