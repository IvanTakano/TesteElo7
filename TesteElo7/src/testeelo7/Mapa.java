/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;

/**
 *
 * @author Ivan
 */
public class Mapa {    

    public static String [][] matriz (String x, String y){
       
        int xConv = Integer.parseInt(x);
        int yConv = Integer.parseInt(y);
        String[][] matriz = new String[xConv+1][yConv+1];
        return matriz;
    }    
    
}
