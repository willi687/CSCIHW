package HW1;

import javax.print.attribute.standard.JobSheets;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        // Pyramid.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Pyramid.Output();
        Adlibs a = new Adlibs();
        //call the story method
        String name = "Josh";
        int age = 21;
        String favoriteColor = "Red";
        System.out.println("Hello! My name is " +name+ " and I am " +age+ " and my favorite color is " +favoriteColor); 
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Replace r = new Replace();
        String s = "Joch";
        int x = 2;
        char z = 's';
        System.out.println(s.substring(0, x) + z + s.substring(x+1)); 

    }
}
