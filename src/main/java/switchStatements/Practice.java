package switchStatements;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int month = scanner.nextInt();

        switch (month){
            case 12,1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
            case 9,10,11:
                System.out.println("Fall");
            default:
                System.out.println("Invalid");
                //================================

                if (month==12 ||month==1||month==2){
                    System.out.println("Winter");

                } else if (month==3 || month== 4 || month== 5) {
                    System.out.println("Spring");
                } else if (month == 6 || month == 7|| month == 8 ) {
                    System.out.println("Summer");
                } else if (month == 9 || month == 10 || month == 11) {
                    System.out.println("Fall");
                } else  {
                    System.out.println("Invalid");
                }


        }
    }
}
