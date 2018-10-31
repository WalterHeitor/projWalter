/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula;

import java.util.Random;

/**
 *
 * @author walterheitorfreitas
 */
public class Aluno {
    //variaveis
    int tempo;      //quantidade tempo inserida pelo usario
    int qtdDisc;   //quantidade de disciplina inserida pelo usuario
    double[] grauDisc = new double[qtdDisc];
    double[] discTempo = new double[tempo];
    double[] vetorDiscGDif = new double[qtdDisc*3];
    //declaraçao de variaveis para formula
   private float tempoFormula;
   private double potencia,expoente;
   private double[] nota = new double[qtdDisc];
   private double[] di = new double[qtdDisc];
   private double[] ti = new double[qtdDisc];
    private final double e = 2.718281;    
     public void randon_GrauDisc(int qtdDisc){
        int cont1 = 0;
        int a;
        grauDisc=new double[qtdDisc];
         System.out.println("-----------------------000-----------------------------------------");
         cont1++;
        for(a=0;a<qtdDisc;a++){//cada indice e uma Disciplina
            Random random = new Random();//inseri valores aleatorios em,
            int x = random.nextInt(5);  //em grau de dificuldade                     
            this.grauDisc[a]=x+1;                                 
        }    
    }
     
     public void randon_DiscTempo(int tempo){
         int[] vetor1;
                vetor1 = new int[tempo];
         int[] frequencia;
                frequencia = new int[qtdDisc];
         for(int a=0;a<tempo;a++){   //indice e tempo
            Random random = new Random();//inseri valores aleatorios em            
            int x =  random.nextInt(qtdDisc);  //em Diciplinas           
            vetor1[a]=x;
         }        
         for(int a=0;a<tempo;a++){
             try{
                 
                 ++frequencia[vetor1[a]];
             }
             catch(ArrayIndexOutOfBoundsException ex)
             {
                 System.out.println(ex);
                 System.out.printf("vetor1[%d] = %d%n%n",a,vetor1[a]);
             }            
         }
         discTempo = new double[tempo];
         for(int i=0; i<qtdDisc;i++){
             discTempo[i]=frequencia[i];             
         }
     }
     
     public void calcularAluno(int temp,double[] di1,double[] ti1){
        double[] vetorNota;
        vetorNota = new double[qtdDisc];
        int cont=0;
         for(int i=0; i< qtdDisc; i++){
                expoente = (-ti1[i]/di1[i]);//e^-ti/di
                potencia = Math.pow(e, expoente);//potencia=2.781^ ao resultado  expoente acima
                vetorNota[i] = (10*(1-potencia));//na formula esta 20*(1-expoente
                
                if(vetorNota[i]>=6){
                    cont++;
                }
     }
         if(cont==5){
             int contCerta=0;
             vetorDiscGDif = new double[qtdDisc*3];
             for(int b=0; b<(qtdDisc);b++){
               vetorDiscGDif[b]= grauDisc[b];
               vetorDiscGDif[b+4]= discTempo[b];
               vetorDiscGDif[b+8]= vetorNota[b];
               
             }contCerta++;
             for(int b=0; b<(qtdDisc*3);b++){
                 System.out.println("indice ["+b+"] valor "+vetorDiscGDif[b]);
             }
         }       
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getQtdDisc() {
        return qtdDisc;
    }

    public void setQtdDisc(int qtdDisc) {
        this.qtdDisc = qtdDisc;
    }
     
}
