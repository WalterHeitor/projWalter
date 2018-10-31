/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenerico;

/**
 *
 * @author walterheitorfreitas
 */
public class Fitness {
    public float[][] calcularFitness(int tempo,int linha, float[][]populacao){
       // int[][] populacao = new int[linha][coluna];
       float total = 0;
       int qtdDisc = 5;
       int[] frequencia;
//                frequencia = new int[qtdDisc];
       float []vetorTempo;
       vetorTempo = new float[tempo]; 
       float[]vetorNota ;
        Frequencia F = new Frequencia();                
        RetornoNota N = new RetornoNota();       
        for(int i=0; i < linha;i++){
               for(int j=0; j<tempo;j++){
                   vetorTempo[j] = populacao[i][j];
                   frequencia = F.frequencia(tempo, vetorTempo);
               vetorNota = N.retornoNota(qtdDisc, frequencia);
               float totalSum = 0;
//               total = 0;
               for (int counter = 0; counter < vetorNota.length; counter++){
               totalSum += vetorNota[counter];
               }
               total=(totalSum/4);
               
               
               /*System.arraycopy(vetorTempo, 0, populacao[i], 0, tempo);*/
            
               }
               populacao[i][tempo] = total;
                 //  System.out.println("total "+total+" I= "+i+" j= "+tempo);
        }
        return populacao;
        
    }
}
