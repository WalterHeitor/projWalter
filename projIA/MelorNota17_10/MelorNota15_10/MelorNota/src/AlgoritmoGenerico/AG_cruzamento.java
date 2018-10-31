/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenerico;

import java.util.Random;


public class AG_cruzamento {



    public void executaCruzamentos(int individuo, int tempo, float[][] populacao){
        AG_selecionaParaCruzamento objetoUsadoQuandoQueremosSelecionarParaCruzamento = new AG_selecionaParaCruzamento();
        Random r = new Random();
        
        float[][] populacaoAuxiliar = new float[individuo][tempo+1];

        int[] pais;
        float[] copiaPai1 = new float[tempo+1];
        float[] copiaPai2 = new float[tempo+1];
        float[] filho1 = new float[tempo+1];
        float[] filho2 = new float[tempo+1];
        for(int numCruzamentos =0 ; numCruzamentos < individuo; numCruzamentos=numCruzamentos+2){
            pais = objetoUsadoQuandoQueremosSelecionarParaCruzamento.torneioEstocastico(individuo, tempo, populacao);
            for(int x=0; x< tempo; x++){
                copiaPai1[x] = populacao[pais[0]][x];//nesse caso, se seguisse o exemplo acima, copiariamos o indivíduo 4 da populacao
                copiaPai2[x] = populacao[pais[1]][x];//nesse caso, se seguisse o exemplo acima, copiariamos o indivíduo 12 da populacao
            }            
            int pontoDeCorte = r.nextInt(tempo);
            
            for(int x =0 ; x< pontoDeCorte; x++){//esse for vai de 0 até o ponto de corte, por exemplo, 9
                
                filho1[x] = copiaPai1[x]; //aqui copiamos para o filho 1 a primeira metade do pai1
                filho2[x] = copiaPai2[x]; //aqui copiamos para o filho 2 a primeira metade do pai2
                
            }
            
            for(int x =pontoDeCorte ; x< tempo; x++){ //esse for vai de 9 até o último gene, nesse caso, 19
                
                filho1[x] = copiaPai2[x]; //aqui copiamos para o filho 1 a segunda metade do pai2
                filho2[x] = copiaPai1[x]; //aqui copiamos para o filho 2 a segunda metade do pai1
                
            }
                      
            for(int x =0 ; x< tempo; x++){
                populacaoAuxiliar[numCruzamentos][x] = filho1[x]; //copiamos o filho 1 para a posicao 
                populacaoAuxiliar[numCruzamentos+1][x] = filho2[x];
            }
        }//fim forcruzamentos
        

        for(int i =0 ; i< individuo; i++){
            for(int gene =0 ; gene< tempo+1; gene++){
                    populacao[i][gene] = populacaoAuxiliar[i][gene];
            } 
        }
        
        
    }
}
