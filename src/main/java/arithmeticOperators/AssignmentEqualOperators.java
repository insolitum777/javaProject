package arithmeticOperators;

public class AssignmentEqualOperators {
    public static void main(String[] args) {
    /*
    = assignment operator ( when you give value to variable)
    == equal equal operator (compares two variables if they are equal or not)
    != not equal operator (compares if two variables are not equal)

    */

        int number1 = 10;//assignment
        int number2 = 8;
        System.out.println(number1 == number2);//false
        System.out.println(100 == 100);//true

        boolean isEqual = 100 == 101;
        System.out.println(isEqual);

        boolean isEven;//if number can be divided by 2
        isEven =80 % 2 ==0; //true
        isEven = 1432354643L%2 == 0;

        int userAge = 43;

        boolean isOdd = userAge % 2 != 0;



    }
}
