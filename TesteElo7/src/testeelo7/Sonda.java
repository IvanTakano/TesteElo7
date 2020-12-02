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
public class Sonda {

    public static void sonda(String x, String y, String z, String[][] Matriz) {
        int xConv = Integer.parseInt(x);
        int yConv = Integer.parseInt(y);
        Matriz[xConv][yConv] = "n";
    }
}

