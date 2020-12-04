/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;

import java.util.Scanner;



/**
 * 
 * @author Ivan
 */
public class Sonda {
    // Criar uma sonda
    public static String[] sonda(){
        String[] sonda = new String[3];
        return sonda;
    }
      
    // Posição inicial da sonda 
    public static String[] sondaCoordenadas(String[][] Matriz) {
        
        Scanner entrada = new Scanner(System.in);  
        
        System.out.println("Digite as coordenadas atuais da sonda: ");
        String[] coordenadasSonda = entrada.nextLine().split(" "); 
        return coordenadasSonda;
    } 
    
}

