package Exercicios_loop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Exer3_Maior_e_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, cont = 0, maior = 0, media = 0;

        do{
            System.out.println("Informe um número: ");
            n = scan.nextInt();
            if(n > maior) maior = n;
            media = media + n;
            cont++;
        } while(cont < 5);

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números é: " + (media/5));
    }
}
