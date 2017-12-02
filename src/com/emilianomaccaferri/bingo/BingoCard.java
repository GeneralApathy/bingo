package com.emilianomaccaferri.bingo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BingoCard {

    private ArrayList<Integer> numbers = new ArrayList<>();

    public BingoCard(){

        boolean found;

        for(int i = 0; i < 10; i++){

            found = false;

            int number = ThreadLocalRandom.current().nextInt(1, 91);

            for(int k = 0; k < this.numbers.size(); k++) {

                if (number == this.numbers.get(k)){

                    i--;
                    found = true;

                }

            }

            if(found){

                i--;
                continue;

            }else
            this.numbers.add(number);

        }

    }

    public void print(){

        for(int i = 0; i < this.numbers.size(); i++){

            System.out.print(this.numbers.get(i) + " ");

        }

    }

    public boolean checkNumber(int number){

        for(int i = 0; i < this.numbers.size(); i++){

            if(this.numbers.get(i) == number){

                System.out.println(number + " " + this.numbers.get(i));
                this.numbers.remove(i);
                return true;

            }

        }

        return false;

    }

    public int size(){

        return this.numbers.size();

    }

}
