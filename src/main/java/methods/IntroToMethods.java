package methods;

public class IntroToMethods {
    static   void voidMethod(){
    System.out.println("Inside void method");
        /*
        void means does not return anything
        inside void method you can write any logic

       */
    }
    static int sum(int a, int b){
        return a + b;
    }

   // public static void main(String[] args) {
     //   voidMethod();

        int result = sum(10,5);
  //      System.out.println(result);
  //  }

    String getCapitalOfFrance(){
        /*
        here you can write any code
         */
        return "Paris";
        /*
        YOU CANNOT WRITE ANY CODE AFTER RETURN
         */
    }

    double getAreaOfRectangle(double length,double width){
        return length * width;
    }
    int getPerimeterOfTriangle(int a,int b, int c){

        return a+b+c;
    }

    int getLengthOFString(String str){
        return str.length();
    }

    public static void main(String[] args) {
        IntroToMethods intro = new IntroToMethods();// createing object
        System.out.println(intro.getAreaOfRectangle(5.4,7.6));

        double areaOfTriangle = intro.getAreaOfRectangle(5.4,7.6);

        int length = intro.getLengthOFString("Barcelona");
        System.out.println(length);


    }







}
