package com.bridgelabz;

import java.util.Random;

public class UC2 {

    public static void main(String[] args) {

        int position = 0;
        int dieRolls = 0;

        Random rand = new Random();

        while (position < 100) {
            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            position += dice;
            System.out.println("Die number is: "+dice);
        }
    }
}
