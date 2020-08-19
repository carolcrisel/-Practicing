/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
package Exercicios3;

import java.util.Scanner;

public class Exer3 
{
	public static void main (String args[])
	{
			int idade,menos=0,mais=0;
			Scanner ler= new Scanner(System.in);
			System.out.println("Digite idade: ");
			idade=ler.nextInt();
			
			while(idade>=1 && idade<=99)
			{
				
				if (idade<=21)
				{
					menos=menos+1;
				}
				else
				{ 
					if(idade>=50)
					{
					mais=mais+1;
					}
					
				}
				System.out.println("Digite idade: ");
				idade=ler.nextInt();
				
			}
			
			System.out.println("Número de idade digitadas menores de 21 é:"+menos);
			System.out.println("Número de idade digitadas maiores de 21 é:"+mais);
			if(idade==-99)
			{
				System.out.println("A idade de -99 anos foi digitada");
			}
			 
	}
	
}
