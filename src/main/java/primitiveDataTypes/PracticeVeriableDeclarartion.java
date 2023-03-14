package primitiveDataTypes;

public class PracticeVeriableDeclarartion {
    public static void main (String [] args){

        byte myByte; //declared variable


        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte); //10

        myByte =20;
        System.out.println(myByte); //20
        _another_byte = 100;
        System.out.println(_another_byte);//100


        /*
        this method takes numbers and multiples
        1. Declare variable (means create variable)
        2.Assign value to variable (put value inside variable)
        3.Reassign value to variable (put new value to the same variable)

        VARIABLE DECLARATION
        byte myByte;
        short myShort;
        int myInt;
        long myLong;

        VALUE ASSIGNMENT
        byte myByte =3; ( declare variable ande assign value)
        short age; (declaring)
        age= 40; (assigning value to variable)

        REASSIGN VALUE
        int number = 100;
        number=30; (reassign value)
        number=0;

        NAMING CONVENTION:
        all variables must start with lower case
        all variables must use camelCase(thisIsMyCamelCaselLongWord)
        all classes must start with upper case, use camelCase
        all packages must start with lower case, use camelCase
        names must start with any letter,or _ or $
         */
        //single line comment

        //------------------------------------------------------

        short myShort1;

        myShort1 = 1000;
        System.out.println(myShort1);

        short myShort2;

        myShort2 = 101;


        System.out.println(myShort2);

        short myShort3;

        myShort3 = 102;

        System.out.println(myShort3);

        short myShort4;
        myShort4 = 104;
        System.out.println(myShort4);

        short myShort5;
        myShort5 = 105;
        System.out.println(myShort5);

        int int1;
        int1 = 3 ;
        System.out.println(int1);

        int int2;
        int2 =20;
        System.out.println(int2);

        int int3;
        int3 = 23;
        System.out.println(int3);
        int int4;
        int4 =23;
        System.out.println(int4);
        int int5;
        int5 = 11;
        System.out.println(int5);

        int int6;
        int6 = 12;
        System.out.println(int6);

        int int7;
        int7 = 26;
        System.out.println(int7);

        int int8;
        int8 = 27;
        System.out.println(int8);

        int int9;
        int9 =28;
        System.out.println(int9);

        int int10;
        int10 = 29;
        System.out.println(int10);

//        ===========================
        /*
        -2 147 000 000 to 2 147 000 000 RANGE OF INTEGER

         */

        long longNumber1 = 1;
        longNumber1 = -2147483649L;
        long longNumber3 = 2147483648L;

        byte byteNumber = 10;
        short shortNumber = 3;
        int intNumber = 40;
        long longNumber = 30;

        longNumber = byteNumber;
        //shortNumber = intNumber; Not work

        // CASTING -is used to store larger variable values into smaller variable values
        intNumber = (int)longNumber;













    }
}
