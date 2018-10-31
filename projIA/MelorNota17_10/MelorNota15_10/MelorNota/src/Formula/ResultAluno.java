/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula;

/**
 *
 * @author walterheitorfreitas
 */
public class ResultAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaraçao de variaveis
        Aluno[] P1;
                P1=new Aluno[10];
                      
            System.out.println("indice de 0 a 3 indica discplina e seu grau dificuldade");
            System.out.println("indice de 4 a 7 indica diciplina e seu tempo gasto");
            System.out.println("indice de 8 a 11 indica diciplina nota da mesma");
        for(int i=0; i<10; i++){
            P1[i]=new Aluno();
            P1[i].qtdDisc=4;
            P1[i].tempo=20;
            P1[i].randon_GrauDisc(P1[i].qtdDisc);
            P1[i].randon_DiscTempo(P1[i].tempo);
            
            P1[i].calcularAluno(P1[i].tempo, P1[i].grauDisc, P1[i].discTempo);
                
        }
    }
    
}
