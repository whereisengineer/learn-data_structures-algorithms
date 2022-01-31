//Find the nth fibonacci number using recursion method.

package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int position = 3;
        System.out.println(getFibonacciNumber(position));
    }

    public static int getFibonacciNumber(int position){
        //base condition
        if(position <= 2)
            return position-1;

        //recursive call
        return(getFibonacciNumber(position - 1) + getFibonacciNumber(position - 2) );
    }
}
