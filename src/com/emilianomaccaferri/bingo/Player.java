package com.emilianomaccaferri.bingo;

import com.emilianomaccaferri.bingo.events.BingoEvent;
import com.emilianomaccaferri.bingo.events.BingoListener;
import com.emilianomaccaferri.bingo.events.BingoSource;

public class Player extends BingoSource implements BingoListener{

    private BingoCard card;
    private String name;

    public Player(BingoCard card, String name){

        this.name = name;
        this.card = card;

    }

    public BingoCard getCard(){

        return this.card;

    }

    public boolean hasWon(){

        if(this.getCard().size() == 0)
            return true;
        else
            return false;

    }

    public void handleBingoEvent(BingoEvent e){

        int extractedNumber = e.getExtractedNumber();
        if(this.card.checkNumber(extractedNumber)){

            System.out.println(this.name + " has found a number!");
            if(hasWon()){

                System.out.println(this.name + " has won the game!");
                System.exit(0);

            }

        }


    }
}
