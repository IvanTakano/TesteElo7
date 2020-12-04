/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;

import java.util.Scanner;
import static testeelo7.Controles.controles;



/**
 * Classe para criarmos a Sonda e sua localização inicial.
 * @author Ivan
 */
public class Sonda {
    private String nome;
    private String[] coordenadas;
    
    
    public Sonda(String nome, String[][] mapa){
        
        this.nome = nome;
        this.coordenadas = sondaCoordenadas(mapa);
    }
    
    // Posição inicial da sonda 
    public String[] sondaCoordenadas(String[][] Matriz) {
        
        Scanner entrada = new Scanner(System.in);  
        
        System.out.println("Digite as coordenadas atuais da " + nome + ": ");
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
}

