package Exercicios2;

import java.util.Scanner;

public class Exer1 
{
	public static void main (String args[])
	{
		Scanner ler =new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Entre com o primeiro número:");
		n1=ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2=ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3=ler.nextInt();
		
		if(n1>n2 && n1>3)
		{
			System.out.println("O maior número é: "+n1);
		}
		else 
		{
			if(n2>n1 && n2>n3)
			{
				System.out.println("O maior número é: "+n2);
			}
			else 
			{
				System.out.println("O maior valor é: "+n3);
			}
		}
		
	}

}
