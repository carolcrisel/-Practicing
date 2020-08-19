package PacoteJava;

import java.util.Scanner;

public class lacoderepeticaodowhile 
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.printf("\nEntre com sua idade: ");
		idade=ler.nextInt();
		do
		{
			System.out.printf("A idade é: %d",idade);
			if (idade>=18)
			{
				System.out.printf("\nVocê é maior de idade");
			}
			else
			{
				System.out.printf("\nVocê é menor de idade");
			}
			System.out.printf("\nEntre com sua idade: ");
			idade=ler.nextInt();
		}
		while(idade>=1);
		if (idade<1)
		{
			System.out.println("Ta brincando comigo?");
		}
		
	}
}
