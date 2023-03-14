package ifElse;

public class AndOperator {
    public static void main(String[] args) {
        if (2<3){
            System.out.println("hello");

        }
        if (5<10){
            System.out.println("hello");
        }
        //======================================

        if (2<3 && 5<10){
            System.out.println("bye bye ");
        }
        if (false && true){
            System.out.println("potato");
        }
        if (true && false){
            System.out.println("do something");
        }
        if (true && true){
            System.out.println("finally true");
        }

        String actualUserName = "sunshine123";
        String actualPassword = "moon123";
        String actualEmail = "sunshine123";

        String enteredUserName= "sunshine123";
        String enteredPassword = "moon123";
        String enteredEmail = "sunshine123";



    }
}
