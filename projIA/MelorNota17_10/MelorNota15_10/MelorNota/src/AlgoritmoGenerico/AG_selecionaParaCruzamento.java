/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenerico;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class AG_selecionaParaCruzamento {
    
    
    public int[] torneioEstocastico(int individuo, int tempo, float[][] populacao){
        
        int[] melhores = new int[2]; //aqui vamos colocar os índices dos dois que ganharem o torneio
        
        float[] fitnessParticipantesTorneio = new float[4]; //vamos usar esse vetor para guardar o fitness dos 4 individuos da população que participarão do torneio
        float maior=0, segundoMaior=0; 
        int indiceMaior=0, indiceSegundoMaior=0;
        
        LinkedList<Integer> listaAuxiliar = new LinkedList(); //essa lista auxiliar vai ser usada para facilitar a randomização dos 4 índices que queremos
        
        
        for(int i=0; i<individuo; i++){//nesse for, fazemos a lista receber todos os índices dos indivíduos da nossa população
            listaAuxiliar.add(i);
        }
        //um exemplo, se tivermos 10 indivíduos, a lista ficará assim -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        
        Collections.shuffle(listaAuxiliar);//usamos esse método para bagunçar nossa lista, ou seja, colocar ela em posição randomica
        //um exemplo, a lista que foi mostrada acima poderia ficar assim -> 3, 8, 7, 1, 2, 0, 4, 6, 5, 9
        //nesse exemplo, os 4 indivíduos que participariam do torneio seriam os do índice 3, 8, 7 e 1
        
        
        
        //   a primeira posição da população é referente ao índice do indivíduo, então para acessar ela usamos os índices da listaAuxiliar
        //   já a segunda posição da população (das colunas) se refere aos genes, queremos acessar a última, porque é onde fica armazenado o fitness
        fitnessParticipantesTorneio[0] =  populacao[listaAuxiliar.get(0)][tempo];
        fitnessParticipantesTorneio[1] =  populacao[listaAuxiliar.get(1)][tempo];
        fitnessParticipantesTorneio[2] =  populacao[listaAuxiliar.get(2)][tempo];
        fitnessParticipantesTorneio[3] =  populacao[listaAuxiliar.get(3)][tempo];
//        System.out.println("Indice " + listaAuxiliar.get(0) + " fitness " +fitnessParticipantesTorneio[0] );
//        System.out.println("Indice " + listaAuxiliar.get(1) + " fitness " +fitnessParticipantesTorneio[1] );
//        System.out.println("Indice " + listaAuxiliar.get(2) + " fitness " +fitnessParticipantesTorneio[2] );
//        System.out.println("Indice " + listaAuxiliar.get(3) + " fitness " +fitnessParticipantesTorneio[3] );
        
        for(int x= 0; x< 4; x++){//esse for vai percorrer o vetor dos fitness dos indivíduos
           
            if(maior < fitnessParticipantesTorneio[x]){//se a variável maior´(que começa em zero) for menor que o valor de fitness salvo na posição x
                maior = fitnessParticipantesTorneio[x]; //copia o valor de fitness
                indiceMaior=x;                          //guarda o índice onde encontrou esse fitness
            }
            
        }
        //se os nossos indivíduos 3, 8, 7 e 1 tiverem os fitness 30, 40, 10 e 20, a variável maior vai sair com o valor 40 e a variável indiceMaior com o valor 1
        
        for(int x= 0; x< 4; x++){//esse for vai percorrer o vetor dos fitness dos indivíduos
           
            if(segundoMaior < fitnessParticipantesTorneio[x] && fitnessParticipantesTorneio[x] !=  maior){
                segundoMaior = fitnessParticipantesTorneio[x];
                indiceSegundoMaior=x;
            }
            
        }
        //se os nossos indivíduos 3, 8, 7 e 1 tiverem os fitness 30, 40, 10 e 20, a variável segundoMaior vai sair com o valor 30 e a variável indiceSegundoMaior com o valor 0
        
        
        melhores[0] = listaAuxiliar.get(indiceMaior); //nesse caso, vamos na lista auxiliar para pegar o melhor no índice 1, que é o indivíduo 8
        melhores[1] = listaAuxiliar.get(indiceSegundoMaior);//o segundo maior que vamos pegar está no índice 0 da lista, que é o indivíduo 3
//        System.out.println("Indice melhor" + melhores[0] + " Indice segundo melhor " +melhores[1] );
        return melhores; //portanto, o vetor melhores sai com 8, 3
        
    }
    
    
    
}
