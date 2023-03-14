package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.type = "dog";
        dog.isMammal= true;
        dog.isCarnivore = false;
        dog.age = "3";
        dog.habitat = "house";

        dog.printInfo();
        System.out.println();

        Animal cat = new Animal();
        cat.type = "Lori";
        cat.isMammal = true;
        cat.isCarnivore = false;
        cat.age = "1";
        cat.habitat = "house";

        cat.printInfo();
        System.out.println();







    }





}
