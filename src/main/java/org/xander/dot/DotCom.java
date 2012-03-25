package org.xander.dot;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: xander
 * Date: 3/20/12
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */

public class DotCom {

    private ArrayList<String> locationCells;
    //int numOfHits = 0;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public String checkYourself(String userInput){

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }

        }
        System.out.println(result);
        return result;
    }
}

