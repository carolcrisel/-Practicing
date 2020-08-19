//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
package Exercicios3;

import java.util.Scanner;

public class Exer2 
{
	public static void main (String args[]) 
	{
		int n,x,par=0,impar=0;
		Scanner ler= new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
		System.out.println("Digite o número: ");
		n=ler.nextInt();
			if(n%2==0)
			{
				par=par+1;
			}
			else
			{
				impar=impar+1;
			}
		}
		System.out.println("\nA quanitdade de números pares digitados foi: "+par);
		System.out.println("\nA quanitdade de números ímpares digitados foi: "+impar);
	}
}
