/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:*/
package Exercicios3;

import java.util.Scanner;

public class Exer4 
{

	public static void main (String args[])
	{
		int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
		Scanner ler= new Scanner (System.in);
		
		while(x<=1)//testando para uma pessoa
		{
			System.out.println("Entre com  sua idade: ");
			idade=ler.nextInt();
			while(idade<=0 || idade>=130)
			{
				System.out.println("Entre com  sua idade: ");
				idade=ler.nextInt();
			}
			System.out.printf("Entre com o sexo: \n1--Mulheres \n2--Homens \n3--Outros\n");
			sexo=ler.nextInt();
			while(sexo<=0 || sexo>=4)
			{
				System.out.println("Entre com o sexo: ");
				sexo=ler.nextInt();
			}
			System.out.println("Entre com o fator psicológico: \n1--Calmo \n2--Nervoso(a) \n3--Agressivo(a) ");
			fp=ler.nextInt();
			while(fp<=0 ||fp>=4)
			{
				System.out.println("Entre com o fator psicológico: \n1--Calmo \n2--Nervoso(a) \n3--Agressivo(a)\n ");
				fp=ler.nextInt();
			}
			if (fp==1)
			{
				contpc++;
			}
			if(sexo==1 && fp==2)
			{
				contmn++;
			}
			if(sexo==2 && fp==3)
			{
				contha++;
			}
			if(sexo==3 && fp==1)
			{
				contoc++;
			}
			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18 )
			{
				contpc18++;
			}
			x++;
		}
		
		System.out.println("Pessoas calmas: "+contpc);
		System.out.println("Mulheres nervosas: "+contmn);
		System.out.println("Homens agressivos: "+contha);
		System.out.println("Outros calmos(as): "+contoc);
		System.out.println("Pessoas nervosas >40: "+contpn40);
		System.out.println("Pessoas calmas <18: "+contpc18);
		
		
	}
}
