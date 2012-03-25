package org.xander.dot;

import java.io.IOException;
import java.util.ArrayList;

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
        DotCom sdc = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add("1");
        locations.add("2");
        locations.add("3");

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
