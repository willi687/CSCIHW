package PROJECT2;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random generator = new Random();
    Scanner keyboard = new Scanner(System.in);

    public void DiceCount() {
        int sides = 6;
        System.out.println("How many Dice? ");
        int count = keyboard.nextInt();
    }

    public static void main(String[] args) {
        Dice die = new Dice();
        die.DiceCount();
    }
}
