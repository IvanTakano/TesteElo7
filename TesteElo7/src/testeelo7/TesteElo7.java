/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeelo7;


import java.util.Scanner;
import static testeelo7.Mapa.matriz;

/**
 *
 * @author Ivan
 */
public class TesteElo7 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        
        System.out.println("Digite as coordenadas do ponto superior-direito: ");
        String[] coordenadas = entrada.next().split(" ");
        matriz(coordenadas[0], coordenadas[1]);
    }

   
}
