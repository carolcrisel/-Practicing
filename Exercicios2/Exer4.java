/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package Exercicios2;

import java.util.Scanner;

public class Exer4 
{
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		int n,p,i;
		System.out.println("Digite o número: ");
		n=ler.nextInt();
		
		if (n%2==0)
		{
			p=(int) Math.sqrt(n);
		System.out.println("A raíz quadrada do número digitado é: "+p);
		}
		else
		{
			i=(int) Math.pow(n, 2);
			System.out.println("O número elevado ao quadrado é:  "+i);
		}
	}

	
	
}
