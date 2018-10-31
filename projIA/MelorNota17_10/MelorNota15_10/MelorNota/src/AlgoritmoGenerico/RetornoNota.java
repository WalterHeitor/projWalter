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
public class RetornoNota {
    Formula P = new Formula();
     public float[]retornoNota(int qtdDisc, int[]frequencia){
         float[] vetorNota;
           // vetorNota = new double[qtdDisc];
         vetorNota = P.calcularAluno(qtdDisc, frequencia);
         float totalNota = (float) 0.0;
         for(int l=0; l<qtdDisc; l++){
             totalNota += vetorNota[l];
         }
         
        return vetorNota;
     }
    
}
