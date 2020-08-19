/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
package Exercicios4;

import java.util.Scanner;

public class Exer3 
{
	public static void main (String args[])
	{
		int[][] matriz = new int[3][3];
		int c=0;
		
		Scanner entrada =  new Scanner (System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for (int linha=0 ; linha < 3 ; linha++)
		{
			for (int coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=entrada.nextInt();
				if (matriz[linha][coluna]>10)
				{
					c++;
					//System.out.println("Número maior que 10 digitado: "+matriz[linha][coluna]);
				}
			}
			
		}
		System.out.println("\nA quantidade de números maiores que 10 digitados é: "+c);
		
		for (int linha=0 ; linha < 3 ; linha++)
		{
			for (int coluna = 0 ; coluna < 3 ; coluna++)
			{
				if (matriz[linha][coluna]>10)
				{
				System.out.printf(" \t %d \t",matriz[linha][coluna]);
				}
			}
			System.out.println();
		}
		
		
		
	}
} 
