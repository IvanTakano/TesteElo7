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
public class Contoles {
  
     
    public static String[] contoles(String[] coordenadaSondas, String[][] matriz, int sondaX, int sondaY) {
        
        Scanner entrada = new Scanner(System.in);
        int xConv = Integer.parseInt(coordenadaSondas[0]);
        int yConv = Integer.parseInt(coordenadaSondas[1]);        
        String z = coordenadaSondas[2].toUpperCase().trim();

        System.out.println("Entre com os comandos para a sonda: \n"
                + "L para virar a esquerda;\n"
                + "R para virar a direita;\n"
                + "M mover para frente;");
        String comando = entrada.next();
        char[] movimento = comando.toUpperCase().trim().toCharArray();
        for (int i = 0; i < movimento.length; i++) {
            if(xConv == sondaX && yConv == sondaY){
                System.out.println("Alerta de colisão no comando de posição: " + (i+1));
            }
            
        
            if(movimento[i] == 'L'){
                
                switch (z){
                    case "N":
                        z = z.replace('N', 'W');
                        break;
                    case "W":
                        z = z.replace('W', 'S');
                        break;
                    case "S":
                        z = z.replace('S', 'E');
                        break;
                    case "E":
                        z = z.replace('E', 'N');
                        break;                    
                }
            }
            else
            if(movimento[i] == 'R'){
                
                switch (z){
                case "N":
                        z = z.replace('N', 'E');
                        break;
                    case "W":
                        z = z.replace('W', 'N');
                        break;
                    case "S":
                        z = z.replace('S', 'W');
                        break;
                    case "E":
                        z = z.replace('E', 'S');
                        break;                 
                }
            }
            else
                
            if(movimento[i] == 'M'){
                switch (z){
                    case "N":
                        if (yConv + 1 < matriz.length ){
                        yConv = yConv + 1;      
                        }
                        else
                            System.out.println("Movimento inválido na posição " + (i+1));
                        break;
                    case "W":
                        if (xConv - 1 >= 0 ){
                        xConv = xConv - 1;
                        }
                        else
                            System.out.println("Movimento inválido na posição " + (i+1));
                        break;
                    case "S":
                        if (yConv - 1 >= 0 ){
                        yConv = yConv - 1;
                         }
                        else
                            System.out.println("Movimento inválido na posição " + (i+1));
                        break;
                    case "E":
                        if (yConv + 1 < matriz[0].length ){
                        xConv = xConv + 1;
                         }
                        else
                            System.out.println("Movimento inválido na posição " + (i+1));
                        break;    
                }
                
            }
        }
        
        String[] controle = new String[3];
        controle[0] = Integer.toString(xConv);
        controle[1] = Integer.toString(yConv);
        controle[2] = z;
        
        return controle;
    }
}
