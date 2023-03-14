package objects;

public class Animal {

    String type;
    boolean isMammal;

    boolean isCarnivore;

    String age;
    String habitat;


    public void eat(){
        System.out.println(type+"is eating");

    }
    public void sleep(){
        System.out.println(type+"Is sleeping");
    }
    public void play(){
        System.out.println(type+"Is playing");
    }

    public void printInfo(){
        System.out.println("Animal type is age  is:"+ type+age+habitat);
        System.out.println("Is animal a mammal"+isMammal);
        System.out.println("Is animal carnivore"+isCarnivore);
        System.out.println("Animals habitat is "+habitat);

    }

}
