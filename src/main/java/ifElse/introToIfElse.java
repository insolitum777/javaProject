package ifElse;

public class introToIfElse {
    public static void main(String[] args) {

        int a =10;
        int b =5;
        System.out.println("I will compare a and b below");

        if (a == b){
            System.out.println("a is less than b");

            System.out.println("I already compared a and b");

        }else{
            System.out.println("a is less than b");

        }

        int number1 = 100;
        int number2 = 50;

        if (number1/number2==2){
            System.out.println("YES,two!");

        }
        else{
            System.out.println("Not two!");
        }

        String elon ="Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not own Paypal");
        }

        //===================================================

        /*
        create 5 if else statements,
        2 boolean statement with numbers
        3 boolean statement with Strings

         */
        int i1=100;
        int i2 = 20;

        if (i1>i2){
            System.out.println("WOW");
        }
        else{
            System.out.println("wow");
        }
        if(i1+i2>1000){
            System.out.println("RIGHT");
        }else{
            System.out.println("NO");
        }

        String chicago = "Cold and windy";
        if (chicago.length()>10){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String theweekend = "In your eyes";
        if (theweekend.contains("eyes")){
            System.out.println("SING");
        }else {
            System.out.println("dont sing");
        }

        String california = "is warm";
        if (california.equals("Is warm")){

        }else {
            System.out.println("Yo");
        }









    }
}
