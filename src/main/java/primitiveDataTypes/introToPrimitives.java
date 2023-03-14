package primitiveDataTypes;

public class introToPrimitives {
    public static void main (String[] args){
        int age = 27;
        int number =100;
        System.out.println(age);
        System.out.println(number);

        age = 28;

        byte myByte1 = 36; //declaring variable
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;
        myByte1 = 50; //reassigning value

        System.out.println(myByte1); //100
        myByte2 = 1;
        System.out.println(myByte2);

        myByte3 = 20;
        System.out.println(myByte3);
        myByte4 = 99;
        System.out.println(myByte4);

        short iceCreamePerDay = 5000;
        short iceCreamePerWeek = 25000;
        //short iceCreamePerWeek
        System.out.println(iceCreamePerDay);
        System.out.println(iceCreamePerWeek);

        int numOfFollowers = 1300;
        numOfFollowers = 300000;
        numOfFollowers = 2140000000;
        System.out.println(numOfFollowers);


        long creditCards1 = 1111222233334444l;
        long creditCards2 = 2150000000l;


    }
}
