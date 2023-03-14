package Practice;

import java.util.Scanner;

public class AtleastTWoTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three booleans");
        boolean a = sc.hasNextBoolean();
        boolean b = sc.hasNextBoolean();
        boolean c = sc.hasNextBoolean();

        if (a && b && c){
            System.out.println("all true");
        } else if ((a && b) || (b && c) || (c && a )) {

        }


    }
}
