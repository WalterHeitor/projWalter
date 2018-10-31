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
public class AGMostraIndividuos {
    public void mostraPopulacao(int individuo, int tempo, float[][] populacao){
        
        
        
        
        
        for(int i=0;i<individuo; i++){
            
            System.out.print("Individuo("+i+")");
            for(int j=0;j<tempo; j++){
                
                 System.out.print("- " + populacao[i][j]+" " );
            }
            System.out.print(" fitness " + populacao[i][tempo] );
            System.out.println();
        }
    }
}
