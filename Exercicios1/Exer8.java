/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com
	percentagem do distribuidor e dos impostos (imposto ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escrever o custo ao
	consumidor. */
package Exercicios1;

import java.util.Scanner;

public class Exer8 
{
	public static void main (String args[])
	{
		Scanner ler=new Scanner (System.in);
		double cfc,cc;//custo de fabricação do carro,custo ao consumidor
		System.out.println("Digite o custo de fabricação do carro: ");
		cfc=ler.nextInt();
		//cc=cfc + (0,45+0,28)*cfc;
		cc= ((0.45+0.28)*cfc)+cfc;
		System.out.println("O custo ao consumidor é de: "+cc+" reais.");
	}
}
