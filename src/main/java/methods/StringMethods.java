package methods;

public class StringMethods {

    static boolean compareStrings(String str1, String str2){
        if(str1.equals(str2)){
            return true;

        }else return false;
    }

    public static void main(String[] args) {
        boolean isSame= compareStrings("hello","hello");
        System.out.println(isSame);
        System.out.println(getSum(5));
    }


    static  String concatenateStrings (String string1 ,String string2){
        return (string1+string2).toUpperCase();
    }


    static int concatenateStringsLength (String s1, String s2){

        return (s1+s2).length();
    }

    static boolean evenOrNot (int num){
        if (num % 2 ==0){
            return true;
        }return false;
    }


    public static boolean divisibleBy10(int num){
       return num % 10 == 0;
    }

    public static void    Calculator (int num){
        for (int i = 1 ;i <= 10 ;i ++ ){
           System.out.println(num+"*"+i+"="+(num*i));

            }
        }
        public static int getLargest(int a , int b){
        if (a>b){
            System.out.println(a);
            return a;
        }System.out.println(b);
        return b;
    }
    public static int getAverage(int i1, int i2, int i3, int i4 ){
        return (i1+i2+i3+i4)/4;
    }
    public static int getSum( int num){
        int sum = 0;
        for(int i = 1 ; i<=num ; i++){
            sum = sum + i ;
        }return sum;
    }

    public static int Doublesum( int a, int b){
        if (a == b){
            return (a+b)*2;

        }else{
            return a + b;
        }
    }
    public int difference21(int n){
        if ( n <= 21){
            return 21 -n;

        }return (n - 21)*2;
    }
    public boolean makes10(int a , int b ){
        if (a==10 || b ==10 || a+b==10){
            return true;
        }return false;

    }









}
