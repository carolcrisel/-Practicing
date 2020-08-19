//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

package Exercicios3;
public class Exer1 
{
	public static void main (String args[])
	{
		int x;
		double r;
			for(x=1000;x<=1999;x++)
			{
				r=x%11;
			   if(r==5) 
				{
					System.out.println(x);
				}	
			}
	}
}
