package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {
        /*
        if (boolean){
        write some code
        }

        else if (boolean){
        write else if code
        }
        else{
        write else code
        }

        */


       int day =3;
       int day1 =4;

       if (day>1){
           System.out.println("Monday");

       } else if (day==3) {
           System.out.println("Tuesday");

       } else if (day<5) {
           System.out.println("Wednesday");


       }else if (day<4){
           System.out.println("Thursday");
       } else if (day1==4) {
           System.out.println(day1);

       } else if (day==6) {
           System.out.println("Friday");

       }


       String dayOfWeek = "Tuesday";
       if (dayOfWeek.equalsIgnoreCase("monday")){
           System.out.println("Monday");
       }if (dayOfWeek.equals("Tuesday")){
           System.out.println("Tuesday");
        }if (dayOfWeek.equals("Wednesday")){
           System.out.println("Wdnesday");
        }if (dayOfWeek.equals("Thursday")){
           System.out.println("Thursday");
        }if(dayOfWeek.equals("Friday")){
           System.out.println("Friday");
        }if (dayOfWeek.equals("Saturday")){
           System.out.println("Saturday");
        }if (dayOfWeek.equals("Sunday")){
           System.out.println("Sunday");
        }


       byte time = 18;
       if (time >=9 && time <= 17){
           System.out.println("WORK HOURS");
       } else if (time>=7 && time <= 9||time>=18&&time <=19) {
           System.out.println("Commute hrs");

       }



    }
}
