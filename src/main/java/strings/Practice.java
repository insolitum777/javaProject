package strings;

public class Practice {
    public static void main(String[] args) {

        String word = "Apple";

        if (word.contains("e")){
            System.out.println(word.indexOf('e'));
        }else {
            System.out.println("The word doesn't contains 'e' ");
        }

    }
}
