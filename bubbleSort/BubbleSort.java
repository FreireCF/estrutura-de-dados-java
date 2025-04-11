package bubbleSort;
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ordenado;
        byte troca;

        System.out.println("\nInsira o tamanho do vetor: ");
            int n = scanner.nextInt();
            scanner.nextLine();
        int[] vetor = new int [n];

        System.out.println("Preenchendo o vetor com "+n+" números aleatórios");
        System.out.println("...");
        for(int i=0; i<n; i++){
            vetor[i] = random.nextInt(100);
        }
        System.out.println("Vetor preenchido: ");
        System.out.print("[ ");
        for(int percorre : vetor){
            System.out.print(percorre+ " ");
        }
        System.out.println("]");

        System.out.println("\nOrdenando o vetor");
        System.out.println("...");
        do {
            troca = 0;
            for(int i=0; i<n-1; i++){
                if(vetor[i] > vetor[i+1]){
                    ordenado = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = ordenado;
                    troca = 1;
                }
            }
        } while (troca==1);

        System.out.println("Vetor ordenado: ");
        System.out.print("[ ");
        for(int percorre : vetor){
            System.out.print(percorre+ " ");
        }
        System.out.println("]");
        scanner.close();
    }
}
