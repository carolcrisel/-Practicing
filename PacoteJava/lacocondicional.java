package PacoteJava;

import java.util.Scanner;

public class lacocondicional {
	public static void main (String args[])
	{
		Scanner ler=new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com sua idade: ");
		idade=ler.nextInt();
		ler.nextLine();
		System.out.print("Entre com seu nome: ");
		nome=ler.nextLine();
		
		System.out.printf("Seu nome é: %s",nome);
		System.out.printf("\ne a idade é: %d",idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVocê é maior de idade.");
		}
		else
			if (idade>=1 && idade<18)
		{
			System.out.printf("\nVocê é menor de idade.");
		}
			else 
			{
				System.out.printf("\nVocê entrou com uma idade inválida.");
			}
		
		
		
	}

}
