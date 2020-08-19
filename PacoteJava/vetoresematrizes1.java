package PacoteJava;

import java.util.Scanner;

public class vetoresematrizes1 
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		
		int [] arrayum = {12,3,5,68};
		int [] arraydois = {43,42, 4,8};
		
		float[] nota=new float[5];
		
		//tamanho do array
		
		if (arraydois.length >8)
		{
			System.out.println("Tamanho do Arraydois - Maior que 8 ! ");
		}
		else
		{
			System.out.println("Tamanho do Arraydois - Menor que 8 !");
		}
		System.out.println("\nTamanho do Arrayum = "+arrayum.length);
		
		//utilizando a ferramenta for-each
		
		String[] cars = {"Volvo","","ford","Madza"};
		
		for(String i : cars) 
		{
			 System.out.println(i);
		}
		
		//populando um array
		for(int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i]=entrada.nextFloat();
		}
		//apresentando um array
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Nota"+i+1+"="+nota[i]);
		}
	}

}
