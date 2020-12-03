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
       
        String[][] marte = matriz(); 
        
        String[] coordenadas = sondaCoordenadas(marte);         
        sonda1 = contoles(coordenadas, marte);
        System.out.print("\nSonda2 \n");
        coordenadas = sondaCoordenadas(marte);
        sonda2 = contoles(coordenadas, marte);
        
        
        System.out.println("Sonda 1: ");
        for (int i = 0; i < sonda1.length; i++) {
            System.out.print(sonda1[i] + " ");            
        }   
        System.out.println("\n\nSonda 2: ");
        for (int i = 0; i < sonda2.length; i++) {
            System.out.print(sonda2[i] + " ");            
        }   
        System.out.println("");           
    }   
}
