package strings;

public class StringToLowerCase {
    public static void main(String[] args) {
        String word = "Helloo EveryOne! HOW ARE you doing";
        word = word.toLowerCase();//converts to lower case
        System.out.println(word);

        String word2 = "hello guys, I'm good. AND you?";
        System.out.println(word2);

        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";


        System.out.println(word3.equalsIgnoreCase(word4));



    }

}
