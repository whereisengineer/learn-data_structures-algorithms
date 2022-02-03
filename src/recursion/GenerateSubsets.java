package recursion;

//Write a program to generate a subsets of a string using recursion

public class GenerateSubsets {

    public static void main(String[] args) {
        String str= "ABC";

        printSubsets(str, "",0 );
    }

    public static void printSubsets(String str, String cur, int index){

        if(index == str.length()){
            System.out.println(cur);
            return;
        }

        printSubsets(str, cur, index+1);
        printSubsets(str, cur+str.charAt(index), index+1 );

    }
}
