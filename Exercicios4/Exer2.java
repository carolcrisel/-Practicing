/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
package Exercicios4;

import java.util.Scanner;

public class Exer2 
{
	public static void main (String args[])
	{
		float[] n=new float[7];
		float[] parimpar=new float[7];
		float sp=0,im=0,q;//somapares,impares e quantidade
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com o valor: ");
			n[i]=ler.nextFloat();
			
			if (n[i]%2==0)
			{
				sp=sp + n[i];
				parimpar[i]=1;
			}
			
			if (n[i]%2!=0)
			{
				im++;
				parimpar[i]=0;
				
			}
		}
		//tentando mostrar os números digitados
		for(int i=0;i<6;i++) 
		{
			if(parimpar[i]==1)
			{
				//COMO ESCREVER OS VALORES EM LISTA??
			//System.out.println("\nOs números pares digitados foram: "+n[i]);
			System.out.println(n[i]);
			}
			if (n[i]%2!=0)
			{
			//System.out.println("\nOs números ímpares digitados foram: "+n[i]);
			System.out.println(n[i]);
			}
		}
		
		
		
		System.out.println("\nA soma dos números pares é:"+sp); 
		System.out.println("\nA quantidade de números ímpares digitados foi de: "+im);
	}
}
