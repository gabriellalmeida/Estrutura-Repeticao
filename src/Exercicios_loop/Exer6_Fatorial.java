package Exercicios_loop;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class Exer6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial, i, multiplica = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();
        System.out.println("Fatorial de: " + fatorial);
        System.out.print(fatorial + " != ");
        for(i=fatorial; i>0; i--){
            multiplica = multiplica * i;
        }
        System.out.println(multiplica);
    }
}
