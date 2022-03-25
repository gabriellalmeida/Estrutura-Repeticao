package Exercicios_array;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Exer4_Multidimensional {
    public static void main(String[] args) {
       Random random = new Random();

        int[][] M = new int[4][4];

        for(int i=0; i<M.length; i++){  //Preenche a matriz
            for(int c=0; c<M[i].length; c++){
                M[i][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {  //Imprimindo a Matriz
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
