package Exercicios1;

import java.util.Scanner;

public class Exer1 {
	public static void main(String args[])
	{
		int ano,mes,dia,td;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a quantidade de anos: ");
		ano=ler.nextInt();
		System.out.println("Entre com a quantidade de meses: ");
		mes=ler.nextInt();
		System.out.println("Entre com a quantidade de dias: ");
		dia=ler.nextInt();
		
		td=ano*365+mes*30+dia;
		
		System.out.println("Você viveu 20"+td+" dias de vida!");
		if(td>100000)
		{
			System.out.println("Nossa você já viveu muito!");
		}
		else
		{
			System.out.println("Você ainda tem muito pra viver!");
		}
		
	}

}
