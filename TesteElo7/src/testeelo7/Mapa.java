/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;

import java.util.Scanner;

/**
 * Classe para cria a dimensão do ambiente
 * @author Ivan
 */
public class Mapa {    

    private String[][] ambiente;
    
    public Mapa(){
        ambiente = matriz();
    }
    
    // Método para inicializar o tamanho da matriz
    public static String [][] matriz (){
        
        Scanner entrada = new Scanner(System.in);
        
       
        System.out.println("Digite as coordenadas do ponto superior-direito de Marte: ");
        String trans = entrada.nextLine();
        String[] coordenadas = trans.split(" ");        
        int xConv = Integer.parseInt(coordenadas[0]);        
        int yConv = Integer.parseInt(coordenadas[1]);                 
        String[][] matriz = new String[xConv+1][yConv+1];
        return matriz;
    }

    /**
     * @return the ambiente
     */
    public String[][] getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String[][] ambiente) {
        this.ambiente = ambiente;
    }
    
}
