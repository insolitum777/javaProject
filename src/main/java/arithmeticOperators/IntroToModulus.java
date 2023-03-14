package arithmeticOperators;

public class IntroToModulus {
    public static void  main (String[] args){

        /*
        %- modulus returns you the remainder after division
         */

        int a = 12;
        int b = 5;
        int c = a % b; //2
        System.out.println(c);
        System.out.println(100%20);//0
        System.out.println(25%10);//5
        System.out.println(90%20);//10
        System.out.println(5%4);//1

        /*
        Even number are number that can be devidet by 2
        Odds number are numbers that cannot be devided by2
         */

        System.out.println(7%2);//1
        System.out.println(8%2);//0

    }
}
