
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erberson
 */
public class Melodia {
    
    
    //int n_notas_teste;
     
    
    public String pa(int inicial, int razao, int fim  ){
            int[] notas;
            int n_notas=0;
            int j=0;
            //Determinando o tamanho do array...
            //System.out.println("Determinando o tamanho do array...");
             n_notas = ((fim-inicial)/razao)+1;
             notas = new int[n_notas];
             
            for (int i = inicial; i <= fim; i+=razao ){
                
                System.out.println(i%12);
                notas[j]=(i%12);
                j++;              
             }
             
             System.out.println("Notas" + n_notas);
             
             System.out.println("Imprimindo o array");
             for (int i = 0; i < n_notas; i++) {
                System.out.println(notas[i]);
                
             }
             //System.out.println("Notas: "+ Arrays.toString(notas));
        return Arrays.toString(notas);
       
    }
    
    

        
}
