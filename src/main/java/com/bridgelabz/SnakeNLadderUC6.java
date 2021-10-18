package com.bridgelabz;

import java.util.Random;

public class SnakeNLadderUC6 {

    public static void main(String[] args){

        int position = 0;
        final int NO_PLAY=1;
        final int LADDER=2;
        final int SNAKE=3;
        int dieRolls = 0;

        Random rand = new Random();

        while(position<100) {
            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            int options = rand.nextInt(3) + 1;

            switch (options) {
                case NO_PLAY: break;
                case LADDER:
                    if (position + dice <= 100) {
                        position += dice;
                    }
                    break;
                case SNAKE:
                    if (position - dice >= 0) {
                        position -= dice;
                    } else
                        position = 0;
                    break;
            }
            System.out.println("Current position is: "+position);
        }
        System.out.println("Number of times die has rolled: "+dieRolls);
        System.out.println("Player has WON!");
    }
}
