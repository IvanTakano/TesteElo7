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

    public static int [][] matriz (String x, String y){
       
        int xConv = Integer.parseInt(x);
        int yConv = Integer.parseInt(y);
        int[][] matriz = new int[xConv][yConv];
        return matriz;
    }    
    
}
