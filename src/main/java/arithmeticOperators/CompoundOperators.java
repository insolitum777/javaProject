package arithmeticOperators;

public class CompoundOperators {
    public static void main(String[] args) {
        int a = 5;
        a++; //a = a+1
        a++; //7
        a++; //8
        System.out.println(a);//8

        a--; //a = a - 1;
        a--;
        System.out.println(a);//6

        int age = 18;
        System.out.println(age++);//post increment 18
        System.out.println(age);//19

        int price =20;
        System.out.println(++price); //pre increment 21
        System.out.println(price++);//21
        System.out.println(price);//22

        /*
        int money = 20;
        money +=3; //money = money +3

         */



    }
}
