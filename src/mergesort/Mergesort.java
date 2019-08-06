/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Senai
 */

public class Mergesort {
   
    static int vetor[] = {12,11,13,5,6,7,9,50};
   
    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
         System.out.println("Array de entrada \n");
         printArray(vetor);
         mergeSort(vetor, 0, 7);
         System.out.println("\n Array ordenado \n");
         printArray(vetor);
    }
     
    public static void printArray (int aux[]){
        
        for (int z=0; z < aux.length; z++){
            System.out.println(aux[z] + ", ");
        }
    }
    
    
   public static void merge (int vetor[], int inicio, int meio, int fim ){
        
       int aux[] = new int [fim - inicio + 1];
       int i = inicio, j = meio+1, k = 0; 
       
       while (i <= meio && j<= fim){
           if(vetor[i] <= vetor[j]){
               aux[k] = vetor[i];
               k++;
           i++;
           }else {
               aux[k] = vetor[j];
               k++;
            j++;
           }
       }
       
       
       while ( i <= meio ){
           aux[k] = vetor[i];
           k++;
       i++;
       }
       
       while( j <= fim ){
           aux[k] = vetor[j];
          k++;
       j++;
       }
       
       i = inicio;
       while( i <= fim ){
           
           vetor[i] = aux[i - inicio];
           i++;
       }
   }
   
   public static void mergeSort (int vetor[] , int inicio, int fim){
      
       if(inicio < fim){
           int meio = (inicio + fim)/2;
           mergeSort(vetor, inicio, meio);
           mergeSort(vetor, meio+1, fim);
           merge(vetor, inicio, meio, fim);
       }
   }
    
}
