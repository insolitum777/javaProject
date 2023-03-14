package primitiveDataTypes;

public class PracticeDoubleFloat {
    public static void main (String [] args){
        /*
        -float and double are variables that store decimal numbers
        -double is larger than float
        -double is the most precise variable
        -Java things that all decimal numbers are double
        -to make sure float is float put F/f in the end
        -

        */
        double priceOfBread = 4.99;
        double priceOfApples = 3.9955544444444444444;
        System.out.println(priceOfApples);

        priceOfBread = 3344434343434344943.43;
        System.out.println(priceOfBread);

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545F;
        double double1 = 2343;

        float1 = (float)double1;
        double1 = float1;

        float1 = int1;
        double1 = 4.99;
        long1 = (long)double1;
        System.out.println(long1);

        //===========================================================
        /*
        4.88- floating, fractional , decimal numbers
        1,2,3 - whole numbers
        0123456789 - octal system
        0123456789 abcdef - hexadecimal
        1,0 -binary system

         */
        short sh;
        float f = 12.7F;

        sh = (short) f;
        System.out.println(sh);

        double price = 2.5;












    }
}
