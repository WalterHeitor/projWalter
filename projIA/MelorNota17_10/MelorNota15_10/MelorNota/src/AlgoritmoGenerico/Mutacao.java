/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenerico;

import java.util.Random;

/**
 *
 * @author walterheitorfreitas
 */
public class Mutacao {
    public float [][] mutInd (float [][] populacao, int numMutacao,int tempo,int individuo){
        int porcentMult = 10;
        int taxaMut;
        int gene;
        int ind;
        int qtd = 5;
        
        Random r = new Random();
        for (int t=0; t<numMutacao; t++){
            taxaMut = r.nextInt(100);
            if (taxaMut <= porcentMult){
                gene = r.nextInt(tempo);
                ind = r.nextInt(individuo);
                populacao[ind][gene] = r.nextInt(qtd);
            }
        }
        return populacao;
        
    }  
}
