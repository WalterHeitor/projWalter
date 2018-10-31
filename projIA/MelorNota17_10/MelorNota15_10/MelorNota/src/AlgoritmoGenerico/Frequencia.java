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
public class Frequencia {
    public int[] frequencia(int tempo,float[]vetor1){
        int qtdDisc = 5;
        int[] frequencia;
                frequencia = new int[qtdDisc];
        for(int a=0;a<tempo;a++){
         try{
         ++frequencia[(int)vetor1[a]];
         }
         catch(ArrayIndexOutOfBoundsException ex)
         {
         System.out.println(ex);
         System.out.printf("vetor1[%d] = %d%n%n",a,vetor1[a]);
         }            
         }
        
        return frequencia;
        
    }
}
