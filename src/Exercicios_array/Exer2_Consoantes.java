package Exercicios_array;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 7 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Exer2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[7];
        int qddconsoante = 0;
        int cont = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))){

                consoantes[cont] = letra;
                qddconsoante++;
            }
            cont++;

        }while(cont < (consoantes.length));

        System.out.println("Quantidade de consoantes: " + qddconsoante);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
}
