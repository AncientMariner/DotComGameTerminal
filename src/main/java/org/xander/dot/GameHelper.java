package org.xander.dot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
/**
 * Created by IntelliJ IDEA.
 * User: xander
 * Date: 3/20/12
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine  = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
