package Exercicios2;

import java.util.Scanner;

public class Exer2 
{
	public static void main(String args[])
	{
		Scanner ler =new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Entre com o primeiro número:");
		n1=ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2=ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3=ler.nextInt();
		
		if (n1>n2 && n1>n3 && n2>n3)
		{
			System.out.println(" A ordem decrescente é "+n1+n2+n3);
		}
		else
		{
			if (n1>n2 && n1>n3 && n3>n2)
			{
				System.out.println(" A ordem decrescent é: "+n1+n3+n2);
			}
			else 
			{
				if (n2>n1 && n2>n3 && n1>n3)
				{
					System.out.println(" A ordem decrescent é: "+n2+n1+n3);
				}
				else
				{
						if (n2>n1 && n2>n3 && n3>n1)
						{
					System.out.println(" A ordem decrescent é: "+n2+n3+n1);
						}
						else
						{
							if(n3>n1 && n3>n2 && n1>n2)
							{
								System.out.println(" A ordem decrescent é: "+n3+n1+n2);
							}
							else 
							{
								System.out.println(" A ordem decrescent é: "+n3+n2+n1);
							}
						}
				}
			}
		}
		if (n1==n2||n2==n3||n1==n3) 
		{
			System.out.println(" Existem números iguais na sequência!");
		}
		
	}
}
