/*Construa um programa em c que, tendo como dados de entrada
 dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 escreva a distância entre eles. A fórmula que efetua tal cálculo é */
//d = raiz((x2-x1)^2+(y2-y1)^2)

package Exercicios1;

import java.util.Scanner;

public class Exer6 
{
	public static void main(String args[])
	{
		Scanner ler=new Scanner (System.in);
		double x1,x2,y1,y2,x,y,d;
		System.out.println("Digite o valor de x1: ");
		x1=ler.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2=ler.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1=ler.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2=ler.nextInt();
		x=(double) Math.pow((x2-x1),2);
		y=(double) Math.pow((y2-y1),2);
		d=Math.sqrt(x+y);
		System.out.println("A distância é igual a "+d);
		
	}

}
