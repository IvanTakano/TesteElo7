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
public class TesteElo7 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Mapa marte = new Mapa();
        Sonda sonda1 = new Sonda("sonda1", marte.getAmbiente());
        sonda1.setCoordenadas(sonda1.getCoordenadas(), marte.getAmbiente());
        
        Sonda sonda2 = new Sonda("sonda2", marte.getAmbiente());  
        sonda2.setCoordenadas(sonda2.getCoordenadas(), marte.getAmbiente());
        
        System.out.print("\nCoordenadas atuais da " +sonda1.getNome()+ ": ");
        for (int i = 0; i < sonda1.getCoordenadas().length; i++) {
            System.out.print(sonda1.getCoordenadas()[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Coordenadas atuais da " +sonda2.getNome()+ ": ");
        for (int i = 0; i < sonda2.getCoordenadas().length; i++) {
            System.out.print(sonda2.getCoordenadas()[i] + " ");
        }
        System.out.println("");
    }
}
