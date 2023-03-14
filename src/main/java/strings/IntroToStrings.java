package strings;

import java.util.concurrent.SynchronousQueue;

public class IntroToStrings {
    public static void  main (String[] args){
        String firstName ="John";
        String lastName = "Doe";
        System.out.println(firstName); //John

        System.out.println(lastName);// Doe

        firstName = "Mike";
        lastName =  "Golt";

        System.out.println(firstName);


        String myName = "Talga";
        String myMiddleName = "No";
        String myLastName = "Mamutbekov";
        byte age;
        age = 18;
        String address = " Arlington Hts";
        String mobile = "7736109045";
        String friendsName ="Zia";
        String city ="Chicago";

        System.out.println(myName);
        System.out.println(myMiddleName);
        System.out.println(myLastName);
        System.out.println(age);
        System.out.println(address);
        System.out.println(mobile);
        System.out.println(friendsName);
        System.out.println(city);

        System.out.println(myName+" "+ myLastName);
        System.out.println("I am "+age);

        System.out.println("I am"+" "+ myName+" "+"I am at"+" "+age+" " +"I live at"+address+" "+"I have a friends his name is"+" " +friendsName+" "+"I love"+" "+city);

        String fruit1 = "apple";

        //=================================================================

        String city1 = "London";
        System.out.println(city1);

        String city2 = new String("New York");
        System.out.println(city2);
        System.out.println(city1.length());
        /*
        lenght() method returns us the number of chars in String*/

         String name = "Antananarivo";
         System.out.println("The lenght on Antananarivo is:"+ name.length());

         System.out.println("Madrid");

         String school = "Codewise";
         school = "Coewise Acadamy";

         /*
         equals() method compares values of 2 Sring
          */

        String fruit = "apple";
        String fruit2 = "apple";

        boolean isSame = fruit.equals(fruit2);
        System.out.println(isSame);

        String fruit3 = "Apple";
        isSame = fruit.equals(fruit3);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";

        System.out.println("Is banana same as orange?"+fruit1.equals(fruit2));
        boolean isSame2 = !fruit1.equals(fruit2);// not equals,True

        int cucumber =5;
        int tomato = 10;

        //=====================================================================
        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILinois";
        String state5 = "florida";

        boolean isSamestate4 = !state1.equalsIgnoreCase(state2);
        boolean isSamestate5 = !state2.equalsIgnoreCase(state4);
        boolean isSamestate6 = state3.equals(state5);
        boolean isSamestate7 = state5.equals(state1);
        boolean isSamestate8 = !state4.equals(state3);
        System.out.println(isSamestate4);
        System.out.println(isSamestate5);
        System.out.println(isSamestate6);
        System.out.println(isSamestate7);
        System.out.println(isSamestate8);




































    }
}
