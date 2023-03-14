package strings;

public class StringTrim {
    public static void main(String[] args) {
        /*
        trim() method removes empty spaces from both of the String
         */

        String batch = "         Batch 2 is cool      ";
        System.out.println(batch);

        batch = batch.trim();
        System.out.println(batch);

        batch.contains("cool");//true
        System.out.println(batch.contains("cool"));//true
        System.out.println(batch.contains("lazy"));//false

        batch = batch.concat("Bena");// is doing concatination
        System.out.println(batch);
        /// charAT, substring, indexOf is most use







    }
}
