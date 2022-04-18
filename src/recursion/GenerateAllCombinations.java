package recursion;

import java.sql.SQLOutput;

public class GenerateAllCombinations {

    public static void main(String[] args) {
        char[] ch = new char[3];
        generate(ch,0);

    }

    public static void generate(char[] ch, int n){

        if(n ==3){
            for(int i =0; i<ch.length; i++)
                System.out.print(ch[i]);
            System.out.println();
            return;
        }

        ch[n] = 'a';
        generate(ch, n+1);

        ch[n] = 'b';
        generate(ch, n+1);

//        ch[n] = 'c';
//        generate(ch, n+1);

    }
}
