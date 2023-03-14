package methodOverLoading;

public class ArithmeticOperations {

    public int getsum2(int int1, int int2) {
        return int1 + int2;
    }

    public int getsum3(int int1, int int2, int int3) {
        return int1 + int2 + int3;
    }


    public int getavarge(int int1, int int2, int int3, int int4) {
        return (int1 + int2 + int3 + int4) / 4;
    }


    public int getavarge(int int1, int int2, int int3, int int4, int int5, int int6) {
        return (int1 + int2 + int3 + int4 + int5 + int6) / 6;
    }


    /*
    create 2 getAreaOfTriangle methods
    1. int base , int heights (1/2 * base * height)

    2. int a ,int b, int c
    int s (a + b + c ) /2
    int area sqrt ( s (s-a) (s - b ) (s-c) )

     */


    public int getAreaOfTriangle(int base, int height) {
        int area = (1 / 2 * base * height);
        return area;
    }

    public double getAreaOfTriangle(int side1, int side2, int side3) {inso
        int semiPerimeter = (side1 + side2 + side3) / 2;
        return semiPerimeter;

    }

}