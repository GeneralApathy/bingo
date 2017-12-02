package com.emilianomaccaferri.bingo;

import com.emilianomaccaferri.bingo.events.BingoSource;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String args[]){

        BingoSource bingoExtractor = new BingoSource();
        Player gianni = new Player(new BingoCard(), "Gianni");
        Player antonio = new Player(new BingoCard(), "Antonio");

        bingoExtractor.addPlayer(gianni);
        bingoExtractor.addPlayer(antonio);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                System.out.println("Gianni's card: ");
                gianni.getCard().print();
                System.out.println("\n");
                System.out.println("Antonio's card: ");
                antonio.getCard().print();

                bingoExtractor.extractNumber();

            }
        }, 0, 5000); // extracts a number every 5 seconds

    }

}
