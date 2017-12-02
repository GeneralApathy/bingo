package com.emilianomaccaferri.bingo.events;

import java.util.ArrayList;

public class BingoSource {

    private ArrayList<BingoListener> listeners = new ArrayList<>();

    public void extractNumber(){

        BingoEvent ev = new BingoEvent(this);
        for(int i = 0; i < this.listeners.size(); i++){

            this.listeners.get(i).handleBingoEvent(ev);

        }

    }

    public void addPlayer(BingoListener listener){

        this.listeners.add(listener);

    }

}
