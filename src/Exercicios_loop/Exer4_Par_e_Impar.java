package Exercicios_loop;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Exer4_Par_e_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qddNumeros, numero, par = 0, impar = 0;
        int cont = 0;

        System.out.println("Quantos números deseja informar: ");
        qddNumeros = scan.nextInt();

        do{
            System.out.println("Informe o número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) par++;
            else impar++;
            cont++;
        } while(cont < qddNumeros);

        System.out.println("Quantidade par: " + par + "\nQuantidade impar: " + impar);

    }
}
