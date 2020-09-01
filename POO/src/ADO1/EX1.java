/*
 Exercício:
 Deseja-se um aplicativo capaz de tomar os dados em um arquivo de texto
 contendo os PIBs por estado do Brasil (pib.txt) carregá-los na memória e executar
 os seguintes itens:
 a-) Imprimir na tela a lista de PIB por estado em percentual em relação ao total.

 */
package ADO1;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author Ivan
 */
public class EX1 {

    public static void main(String[] args) {
        
        String nomeDoArquivo1 = "pib.txt";
        String nomeDoArquivo2 = "regioes";
        String conteudo = "";
        int soma = 0;
        int total = 0;
        try {
            FileReader arq = new FileReader("C:\\Users\\Ivan\\Documents\\pib.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";           
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                   String [] linhaDoArquivo = linha.split(";");
                   String Cidade = linhaDoArquivo[0];
                   String Pib = linhaDoArquivo[1];
                   int PibInt = Integer.parseInt(Pib);
                   soma += PibInt;
                   conteudo += linha;
                   linha = lerArq.readLine();
                                   
                }                

                arq.close();

            } catch (Exception e) {

                conteudo = "Erro: Não foi possível ler o arquivo!";

            }
            
        } catch (Exception e) {
            
            conteudo = "Erro: Aruivo não encontrado!";

        }
        try {
            FileReader arq = new FileReader("C:\\Users\\Ivan\\Documents\\pib.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                   String [] linhaDoArquivo = linha.split(";");
                   String Cidade = linhaDoArquivo[0];
                   String Pib = linhaDoArquivo[1];
                   float PibInt = Float.parseFloat(Pib);
                   conteudo += linha;
                   linha = lerArq.readLine();
                    System.out.println("Pib " + PibInt);
                    System.out.println("Soma " + soma);
                   System.out.println(Cidade + " "+((PibInt / soma) * 100) + " %"  );             
                }                

                arq.close();

            } catch (Exception e) {

                conteudo = "Erro: Não foi possível ler o arquivo!";

            }
            
        } catch (Exception e) {
            
            conteudo = "Erro: Aruivo não encontrado!";

        }        
        
    }
}
