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
class MelhorIndividuo {
    public float selecionaIndividuo(float[][]populacao,int individuo, int tempo){
        
        float maior =0;
        
        for(int i=0; i<individuo ;i++){
            if(maior<populacao[i][tempo]){
                maior = populacao[i][tempo];
            }
        }
        
        return maior;
        
    }
}
