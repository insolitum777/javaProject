package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temp = user.nextDouble();

        System.out.println("Is it raining? true /false");

        boolean isRaining = user.nextBoolean();
        if (temp<0){
            System.out.println("Its freezing outside! Wear a heavy coat, gloves, and a hat");
        } else if (isRaining && temp>=0 && temp <=10) {
            System.out.println("Its chilly and rainy! Wear a raincoat<boots<and a scarf.");
        } else if (!isRaining && temp>=0 && temp<=10) {
            System.out.println("Its chilly outside!Wear a jacket, gloves, and a hat.");
        } else if (isRaining && temp>=11 && temp<=20) {
            System.out.println("Its cool and rainy!Wear a light jacket,boots, and a scarf.");

        } else if (!isRaining && temp>=11 && temp<=20) {
            System.out.println("Its cool outside! Wear a light jacket and  comfortable shoes.");
        } else if (isRaining && temp>=20) {
            System.out.println("Its warm and rainy! Wear a light jacket< shorts , and sandals.");
        } else if (!isRaining&&temp>= 20) {
            System.out.println("Its warm outside!Wear a t-shirt, shorts, and comfortable shoes");
        }

    }
}
