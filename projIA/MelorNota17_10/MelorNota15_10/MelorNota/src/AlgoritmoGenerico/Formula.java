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
public class Formula {
     public float[] calcularAluno(int qtdDisc,int[] ti1){
        float expoente, potencia;
        final float e = (float) 2.718281;
        float[] vetorNota;
        float[] di1 = {5,4,3,1,2};
        
        vetorNota = new float[qtdDisc];
         for(int i=0; i< qtdDisc; i++){
                expoente = (-ti1[i]/di1[i]);//e^-ti/di
                potencia = (float) Math.pow(e, expoente);//potencia=2.781^ ao resultado  expoente acima
                vetorNota[i] = (10*(1-potencia));//na formula esta 20*(1-expoente                
     }        
     return vetorNota;
    }
}
