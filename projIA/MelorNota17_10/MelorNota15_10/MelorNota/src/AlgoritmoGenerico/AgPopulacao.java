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
public class AgPopulacao {
    
   
    
    public float[][] geraPopulacao(int tempo,int linha){
        //Declaraçao de variaveis
       int qtdDisc = 5;
       int[] vetorTempo;
       float[][]populacao = new float [linha][tempo+1];
       RandonTempo R = new RandonTempo();
       for(int i=0; i<linha ;i++){           
           vetorTempo = R.RandonTempo(tempo, qtdDisc);
           for(int j=0; j<tempo; j++){
               populacao[i][j] = vetorTempo[j];
           }
       }
    return populacao;    
    }
}
