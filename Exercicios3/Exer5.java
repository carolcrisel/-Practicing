/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
package Exercicios3;

import java.util.Scanner;

public class Exer5 
{
		public static void main(String args[])
		{
			int n,soma=0;
			Scanner ler= new Scanner (System.in);
			do
			{
				System.out.println("Digite o número: ");
				n=ler.nextInt();
					soma=soma+n;
			}
			while(n!=0);
				System.out.println(" A soma dos números digitados é: "+soma);	
		}
}
