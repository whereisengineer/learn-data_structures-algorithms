// Find the factorial of a number using recursion method.

package recursion;

public class Factorial {
    public static void main(String[] args) {
        int number=-1;
        int factValue= getFact(number);
        System.out.println(factValue);
    }

    public static int getFact(int number){
        //base condition
        if(number <= 1)
            return 1;


        //recursive call
        return number*getFact((number-1));
    }
}
