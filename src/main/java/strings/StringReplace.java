package strings;

import java.util.logging.Level;

public class StringReplace {
    public static void main(String[] args) {
        String word = "Apple banana strawberry";
        word = word.replace('a', 'e');
        System.out.println(word);
        System.out.println(word.replace('e', 'a'));

        String countries = "Italia Columbia Croatia";
        System.out.println(countries.replace(" ", "republic"));
        //=======================================================================

        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream,warm pasta,warm pizza";
        foods = foods.replace("hot", "tasty");
        foods = foods.replace("cold", "cool");
        foods = foods.replace("warm", "italian");
        System.out.println(foods);

        String letters = "hello everyone, hope you are doing good, i wish you good luck";
        letters = letters.replace('f','a');
        System.out.println(letters);
        letters = letters.replace('b','a');

        letters = letters.replace('h','a');
        letters =   letters.replace('e','a');
        letters =   letters.replace('l',  'a');
        letters =   letters.replace('l','a');
        letters = letters.replace('o', 'a');
        letters = letters.replace('e','a');
        letters = letters.replace('v','a');
        letters = letters.replace('r','a');
        letters = letters.replace('y','a');
        System.out.println(letters);








    }


    }
