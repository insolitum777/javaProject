package strings;

import javax.swing.*;
import java.util.SimpleTimeZone;

public class PracticeStrings {
    public static void main(String[] args) {
        String singerName = "Michael Jackson";
        System.out.println(singerName. length());
        System.out.println(singerName.endsWith("ON"));// returns number pf chars
        System.out.println(singerName.startsWith("Misha"));// false
        System.out.println(!singerName.isEmpty());//true
        System.out.println(singerName.toLowerCase());//michael jackson

        System.out.println(singerName);//Michael Jackson


        System.out.println(singerName);


        System.out.println(singerName.charAt(0));//M
        System.out.println(singerName.charAt(0)+""+singerName.charAt(3));//Mh

        System.out.println(singerName.charAt(8));
        System.out.println(singerName.indexOf("c"));//2
        System.out.println(singerName.indexOf("C",3));
        System.out.println(singerName.indexOf("W"));//-1 means string doesnt exist


        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName);
        System.out.println(areTheySame);//false
        System.out.println(!singerName.equals(singerName2));//true
        System.out.println(singerName.equals(singerName2));//true
        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));//true







    }
}
