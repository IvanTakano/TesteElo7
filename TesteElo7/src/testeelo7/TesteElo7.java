/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;


import java.util.Scanner;
import static testeelo7.Mapa.matriz;
import static testeelo7.Sonda.sonda;

/**
 *
 * @author Ivan
 */
public class TesteElo7 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        
        System.out.println("Digite as coordenadas do ponto superior-direito de Marte: ");
        String[] coordenadasMarte = entrada.next().split(" ");
        String [][] marte = matriz(coordenadasMarte[0], coordenadasMarte[1]);
        
        System.out.println("Digite as coordenadas atuais da sonda: ");
        String[] coordenadasSonda = entrada.next().split(" ");        
        sonda(coordenadasSonda[0], coordenadasSonda[1], coordenadasSonda[3], marte);
        
        System.out.println("Digite as coordenadas de movimentos da sonda: ");
        String movimentos = entrada.next();
    }   
}
