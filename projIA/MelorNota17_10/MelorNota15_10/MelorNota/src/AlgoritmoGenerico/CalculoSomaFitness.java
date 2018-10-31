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
public class CalculoSomaFitness {
    public float calcularFitness(int tempo,int linha, float[][]populacao){
       // int[][] populacao = new int[linha][coluna];
       float total = 0;
       int qtdDisc = 5;
       int[] frequencia;
       float somatoriaTotal = 0;
       float[]sumTotal;
       float totalSum;
       sumTotal = new float[linha];
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
               totalSum = 0;
//               total = 0;
               for (int counter = 0; counter < vetorNota.length; counter++){
               totalSum += vetorNota[counter];
               }
               total=(totalSum/4);
               
               }
              sumTotal[i]=total; 
        }
        for (int counter = 0; counter < sumTotal.length; counter++){
               somatoriaTotal += sumTotal[counter];
               }
        somatoriaTotal  = somatoriaTotal/linha;
        return somatoriaTotal;
        
    }
}
