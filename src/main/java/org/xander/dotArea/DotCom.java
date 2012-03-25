package org.xander.dotArea;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: xander
 * Date: 3/25/12
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  : ( ");
            } else {
                result = "hit";
            }
// close if
    } // close if
    return result;
} // close method
} // close class
