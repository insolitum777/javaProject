package ifElse;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number3 = 10;
        int number5= 15;

        if (number3>number5){
            System.out.println("10 less than 15");
        }else{
            System.out.println("10 more than 15");
        }

        if (number3<number5){
            System.out.println("15 more than 10");

        }else{
            System.out.println("15 less than 10");
        }

        if (number3==number5){
            System.out.println("10 equals to 15");

        }else{
            System.out.println("not equal");
        }
        //=========================================

        int digit = 40;
        if (digit>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        //====================================


    }


}
