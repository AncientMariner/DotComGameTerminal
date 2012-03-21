package org.xander.dot;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: xander
 * Date: 3/20/12
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotComGame {
    public static void main(String[] args) throws IOException {
        
        int numbOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom sdc = new SimpleDotCom();
        int randomNumber = (int)(Math.random() * 5);
        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
        
        sdc.setLocationCells(locations);
        
        boolean isAlive = true;
        
        while (isAlive == true){

           // System.out.print("enter a number  ");
            String guess = helper.getUserInput("enter a number");
            //String userInput = System.in.toString();
            String result = sdc.checkYourself(guess);
            numbOfGuesses++;
                    
            if(result == "kill"){
                isAlive = false;
                System.out.println("You took " + numbOfGuesses + " guesses");
            }


        }
        
    }
    
}
