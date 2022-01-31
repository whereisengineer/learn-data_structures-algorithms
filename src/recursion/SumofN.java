//Program to find the sum of first N numbers using recursive approach.

package recursion;

public class SumofN {
    public static void main(String[] args) {
        int nValue = 2;
        System.out.println(getSum(nValue));
    }

    public static int getSum(int nValue){
        //base conditon
        if(nValue <=0)
            return 0;

        //recursive call
        return (nValue + getSum(nValue -1));
    }
}
