/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;


import java.util.Scanner;
import static testeelo7.Mapa.matriz;
import static testeelo7.Sonda.sondaCoordenadas;
import static testeelo7.Contoles.contoles;
import static testeelo7.Sonda.sonda;



/**
 *
 * @author Ivan
 */
public class TesteElo7 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
       
        String[] sonda1 = sonda();
        String[] sonda2 = sonda();
        int iniX = 0;
        int iniY = 0;        
       
        String[][] marte = matriz(); 
        
        String[] coordenadas = sondaCoordenadas(marte);         
        sonda1 = contoles(coordenadas, marte, iniX, iniY);
        System.out.print("\nSonda2 \n");
        iniX = Integer.parseInt(sonda1[0]);
        iniY = Integer.parseInt(sonda1[1]);
        coordenadas = sondaCoordenadas(marte);
        sonda2 = contoles(coordenadas, marte, iniX, iniY);
        
        
        System.out.println("Posição atual da sonda 1: ");
        for (String sonda11 : sonda1) {
            System.out.print(sonda11 + " ");
        }   
        System.out.println("\n\nPosição atual da sonda 2: ");
        for (String sonda21 : sonda2) {
            System.out.print(sonda21 + " ");
        }   
        System.out.println("");           
    }   
}
