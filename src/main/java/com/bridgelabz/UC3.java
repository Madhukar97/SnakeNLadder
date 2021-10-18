package com.bridgelabz;

import java.util.Random;

public class UC3 {


    public static void main(String[] args){

        int position = 0;
        final int NO_PLAY=1;
        final int LADDER=2;
        final int SNAKE=3;

        Random rand = new Random();

            int dice = rand.nextInt(6) + 1;

            int options = rand.nextInt(3) + 1;

            switch (options) {
                case NO_PLAY:
                    break;
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
}
