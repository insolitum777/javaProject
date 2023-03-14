package Practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {
        Scanner scjava = new Scanner(System.in);
        System.out.println("Enter any word");
        String word =  scjava.nextLine();

        if(word.contains("Java")){
            System.out.println("Yes, contains Java");
        }else{
            System.out.println("Doesn't contains java");
        }



    }
}
