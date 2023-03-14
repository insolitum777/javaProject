package Loops;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int x = 10; x>=1 ; x--){
            System.out.println(" The value of x is:"+ x);
        }

        for( int y =10; y >= 0 ; y -=2){
            System.out.println("The value is:"+y);
        }

        for( int num =1; num<=15 ; num+=2){
            System.out.println("The value of num is:"+num);
        }


        int sum =0;
        for ( int i = 0; i<=100 ; i+=2){
            System.out.println("The value is:"+i);
            sum = sum+i;
        }

        System.out.println("The result is "+sum);

        //====================



    }
}
