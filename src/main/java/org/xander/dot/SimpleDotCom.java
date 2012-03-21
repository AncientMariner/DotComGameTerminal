package org.xander.dot;

/**
 * Created by IntelliJ IDEA.
 * User: xander
 * Date: 3/20/12
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDotCom {

    int[] locationcCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs){
        locationcCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationcCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationcCells.length){
            result = "kill";
        }
        System.out.println(result);
            return result;
    }
}
