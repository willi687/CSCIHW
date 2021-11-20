package HW2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and retur   n the base.
    public static double Pythag(double a, double b){
       
        a = 5;
        b = 4;
        double hypotenuse;
        hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is: ");
        

        return hypotenuse;
    }


    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

    public static char gradeCalc(double grade){
      char letterGrade = 'x';
       grade  = Math.ceil(grade);    
          
      if (grade >= 90)
      {
         letterGrade = 'A';
      }
      else if (grade < 90 && grade >= 80)
      {
         letterGrade = 'B';
      }
      else if (grade >= 70)
      {
         letterGrade = 'C';
      }
      else if (grade >= 50)
      {
         letterGrade = 'D';
      }
      else
      {
         letterGrade = 'F';
      }

      return letterGrade;
    }
         
              
    
    // 3. Create a method that will calculate the tip on a bill
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    
 


    // you do not need this main if you want to make a tester class
    public static void main(String[] args) {



      System.out.println(Pythag(5, 4));
        
      System.out.println(gradeCalc(76.8));


      
      
      


        
   }

}
