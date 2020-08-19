/*    Escreva um sistema que leia três números inteiros e
 *  positivos (A, B, C) e calcule a seguinte expressão:
D = (R + S) / 2 onde R = (A + B) ^ 2 e S = (B + C) ^ 2     */

package Exercicios1;

import java.util.Scanner;

public class Exer4 
{
	
	public static void main(String args[])
	{
	Scanner ler= new Scanner (System.in);
	int a,b,c,d,r,s;
	System.out.println("Entre com o valor de A: ");
	a=ler.nextInt();
	System.out.println("Entre com o valor de B: ");
	b=ler.nextInt();
	System.out.println("Entre com o valor de C: ");
	c=ler.nextInt();
	r=(int)Math.pow(a+b, 2);
	s=(int)Math.pow(c+b, 2);
	d=(r+s)/2;
	System.out.println("O resultado dessa expressão é: "+d);

	}
	
}




