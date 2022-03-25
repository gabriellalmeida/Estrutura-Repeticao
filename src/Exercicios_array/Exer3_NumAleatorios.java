package Exercicios_array;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Exer3_NumAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i=0; i<numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.print("Números Antecessor: "); //adicional
        for (int numero: numAleatorios) {
            System.out.print((numero-1) + " ");

        }

        System.out.print("\nNúmeros Aleatórios: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");

        }

        System.out.print("\nNúmeros Sucessores: ");
        for (int numero: numAleatorios) {
            System.out.print((numero+1) + " ");

        }
    }
}
