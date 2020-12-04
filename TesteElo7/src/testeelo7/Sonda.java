/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;

import java.util.Scanner;
import static testeelo7.Controles.controles;



/**
 * 
 * @author Ivan
 */
public class Sonda {
   private String nome;
    private String[] coordenadas;
    
    public Sonda(String[][] mapa){
        this.nome = nome;
        this.coordenadas = sondaCoordenadas(mapa);
    }
    
    // Posição inicial da sonda 
    public static String[] sondaCoordenadas(String[][] Matriz) {
        
        Scanner entrada = new Scanner(System.in);  
        
        System.out.println("Digite as coordenadas atuais da sonda: ");
        String[] coordenadasSonda = entrada.nextLine().split(" "); 
        return coordenadasSonda;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the coordenadas
     */
    public String[] getCoordenadas() {
        return coordenadas;
    }

    /**
     * @param coordenadas the coordenadas to set
     */
    public void setCoordenadas(String[] coordenadas, String[][] matriz) {
        coordenadas = controles(coordenadas, matriz);
        this.coordenadas = coordenadas;
    }

    void imprimir(String[] coordenadas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

