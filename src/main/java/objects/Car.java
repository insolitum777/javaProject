package objects;

public class Car {
   String model;
   String year;

   String price;
   String color;

   public void drive(){
       System.out.println(model+ "is driving");
   }
   public void stop(){
       System.out.println(model+"is stopping");
   }
   public void playMusic(){
       System.out.println(model + "Is playing music");
   }
   public void printInfo(){
       System.out.println("Car model is "+ model);
       System.out.println("Car year is "+year);
       System.out.println("Car price is"+price);
       System.out.println("Car color is "+color);
   }

    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Gx";
        car.year = "2021";
        car.price = "1$";
        car.color = "white";


        Car car2 = new Car();
        car2.model = "es";
        car2.year = "2021";
        car2.price ="2$";
        car2.color = "black";


        car.printInfo();
        System.out.println();

        car2.printInfo();
        System.out.println();


    }





}
