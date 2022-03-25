package Exercicios_array;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Exer1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {5, 4, 9, 6, -8, 74};
        int i, cont =0;

        System.out.print("Vetor: ");
        while(cont < (vetor.length)){ //length retorna o tamanho do vetor
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nInverso: ");
        for(i=(vetor.length-1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
