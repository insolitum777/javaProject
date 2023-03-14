package strings;

import java.util.Locale;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you cold and windy";
        String city = message.substring(6,13);
        System.out.println(city);
        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people,the avarage salary is 90k dollars, and our president is Joe Biden";
        String USA = welcomeSign.substring(11,14);
        System.out.println(USA);

        String million = welcomeSign.substring(34,45);
        System.out.println(million);

        String dollars = welcomeSign.substring(75,86);
        System.out.println(dollars);

        String biden = welcomeSign.substring(109,118);
        System.out.println(biden);

        String www = welcomeSign.substring(welcomeSign.indexOf("9"),welcomeSign.indexOf("and "));
        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);



        String phrase = "Just one positive thought in the morning can change your whole day.";
        System.out.println(phrase.substring(0,4) + " a " + phrase.substring(18,25));

        String positive = phrase.substring(9,17) + " "+ phrase.substring(33,40);

        System.out.println(positive);
        String whole = phrase.substring(57,62) +" " +phrase.substring(33,40);
        System.out.println(whole);

        int beginIndex = phrase.indexOf("change");
        int endingIndex = phrase.indexOf(" your");
        String change = phrase.substring(beginIndex,endingIndex);
        //==========================================New assignment
        String str1 ="hi";
        String str2 = "bye";
        System.out.println(str1+str2+str2+str1);

        System.out.println(str1+" "+str2+" "+str1.toUpperCase()+" "+str1.toUpperCase()+" "+ str2.toUpperCase()+" "+str2.toUpperCase()+" "+str2+" "+str1);

        System.out.println(str2.substring(0,1)+str1.substring(1));
        System.out.println(str1.replace('h', 'b'));

        System.out.println(str2.charAt(0)+""+str1.charAt(1));

        String see = "see";
        String hear = "hear";

        System.out.println(see.substring(0,1)+hear.substring(1,4));
        System.out.println(hear.replace('h', 's'));
        System.out.println(see.charAt(0)+hear.substring(1,4));









    }
}
