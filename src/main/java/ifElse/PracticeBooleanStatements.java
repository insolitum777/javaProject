package ifElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {
        boolean b1 = 100>1;//

        String str1 = "avacado";

        boolean b2 =str1.startsWith("d");

        /*
        startWith
        endWith
        contains
        isEmpty
        equals
        length
         */

        boolean b3 = 10<900;
        boolean b4 = 2>1;
        boolean b5 = 30<90;
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);



        String str3 = "Chicago";
        boolean bb1 = str3.startsWith("u");

        System.out.println(bb1);

        String str4 = "tomato";
        boolean bb2 = str4.endsWith("i");

        System.out.println(bb2);

        String str5 = "California";
        boolean bb3 = str5.contains("c");
        System.out.println(bb3);

        String str6 = " Cold";
        boolean bb4 = str6.equals("cold");
        System.out.println(bb4);


        String str7 = "Coffee";
        boolean bb5 = str7.isEmpty();
        System.out.println(bb5);

        String str8 = "water";
        boolean bb6 = str1.length()>10;
        System.out.println(bb6);









    }
}
