package com.emilianomaccaferri.bingo.events;

import java.util.EventObject;
import java.util.concurrent.ThreadLocalRandom;

public class BingoEvent extends EventObject {

    private int extracted = ThreadLocalRandom.current().nextInt(1,91);

    public int getExtractedNumber(){

        System.out.println("\nExtracted number: " + extracted);
        return extracted;

    }

    public BingoEvent(Object ev){

        super(ev);

    }

}
