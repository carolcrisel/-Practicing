package Exercicios1;

import java.util.Scanner;

public class Exer2 {
	
	public static void main(String args[])
	{
		Scanner ler= new Scanner (System.in);
		int ano,mes,dia;
		System.out.println(" Digite sua idade em dias: ");
		dia=ler.nextInt();
		ano=dia/365;
		mes=(dia%365)/30;
		dia=(dia%365)%30;
		System.out.println ("\n Sua idade é de:"+ano+" anos, "+mes+"meses "+" e "+dia+"dias");
	}
	
	

}


