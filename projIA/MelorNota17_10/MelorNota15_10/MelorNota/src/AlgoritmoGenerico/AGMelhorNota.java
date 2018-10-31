/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoGenerico;

import javax.swing.JOptionPane;

/**
 *
 * @author walterheitorfreitas
 */
public class AGMelhorNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AgPopulacao objGerarPopulacao;
        objGerarPopulacao = new AgPopulacao();
        AG_cruzamento objCriarPopulacaoCruzamento;
        objCriarPopulacaoCruzamento=new AG_cruzamento();
        Fitness F = new Fitness();
        CalculoSomaFitness c = new CalculoSomaFitness();
        Mutacao M = new Mutacao();
        MelhorIndividuo melhor = new MelhorIndividuo();
        //------------------------------------------------------------
        int individuo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de indivíduos"));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo usado para estudo"));
        int numeroDeGeracoes= Integer.parseInt(JOptionPane.showInputDialog("Digite o número de gerações"));
        float populacao[][] = objGerarPopulacao.geraPopulacao(tempo, individuo);
        populacao = F.calcularFitness(tempo, individuo, populacao);
        int geracoes =0;
        int i = 0;
        AGMostraIndividuos mostrar = new AGMostraIndividuos();
        
        mostrar.mostraPopulacao(individuo, tempo, populacao);
                
        AG_selecionaParaCruzamento objetoUsadoQuandoQueremosSelecionarParaCruzamento = new AG_selecionaParaCruzamento();
        objetoUsadoQuandoQueremosSelecionarParaCruzamento.torneioEstocastico(individuo, tempo, populacao);
        float[] soma;
        soma = new float[numeroDeGeracoes];
        float[] melhorIndiv;
        melhorIndiv = new float[numeroDeGeracoes];
         while(geracoes < numeroDeGeracoes){
            System.out.println("Geracao " + geracoes);
            System.out.println();
            //o trecho abaixo usa o objeto da classe AG_cruzamento para criar uma nova populaçao usando cruzamentos
             objCriarPopulacaoCruzamento.executaCruzamentos(individuo,tempo,populacao);
            //o trecho abaixo usa o objeto da classe AG_avaliacao para chamar o método executaAvaliacao e avaliar nossa populacao inicial                   
           populacao = F.calcularFitness(tempo, individuo, populacao);
          
          
          populacao = M.mutInd(populacao, numeroDeGeracoes, tempo, individuo);
          
          // mostrar.mostraPopulacao(individuo, tempo, populacao);
            
            soma[geracoes] = c.calcularFitness(tempo, individuo, populacao);
            melhorIndiv[geracoes] = melhor.selecionaIndividuo(populacao, individuo, tempo);
           geracoes++;
        }
         
         while(i < numeroDeGeracoes){
              System.out.println(i+"\t"+soma[i]+"\t"+melhorIndiv[i]);
              i++;
         }
         //mostrar.mostraPopulacao(individuo, tempo, populacao);
           
       
    }    
}
