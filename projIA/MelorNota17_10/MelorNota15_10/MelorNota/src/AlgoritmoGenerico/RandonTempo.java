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
public class RandonTempo {
    
    
    Random r = new Random();
    
    public int[] RandonTempo(int tempo, int qtdDisc){
        
        int[] vetor1;
                vetor1 = new int[tempo];
         
         for(int a=0;a<tempo;a++){   //indice e tempo
            vetor1[a] = r.nextInt(qtdDisc);  //em Diciplinas              
         }        
         
        
        return vetor1;
    
    }
    
}
