package arithmeticOperators;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare 2 values:
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal

         */
        byte potato = 5;
        byte fries = 10;
        System.out.println(potato>fries);//false
        System.out.println(potato<fries);//true
        System.out.println(potato>=fries);//false
        System.out.println(potato<=fries);//true
        System.out.println(potato == fries);//false
        System.out.println(potato != fries );//true


        byte byte1 = 1;
        byte byte2 = 2;
        short short1 = 10000;
        short short2 = 20000;
        int int1 = 100000;
        int int2 = 200000;
        long long1 = 6666660L;
        long long2 = 88888888L;

        System.out.println(byte1>short1);
        System.out.println(byte1<short1);
        System.out.println(byte1>=short1);
        System.out.println(byte1<=short1);
        System.out.println(byte1==short1);
        System.out.println(byte1!=short1);

        System.out.println(byte2>short2);
        System.out.println(byte2<short2);
        System.out.println(byte2>=short2);
        System.out.println(byte2<=short2);
        System.out.println(byte2==short2);
        System.out.println(byte2!=short2);





    }
}
