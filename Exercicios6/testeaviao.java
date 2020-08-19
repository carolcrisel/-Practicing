package Exercicios6;

public class testeaviao 
{
	public static void main (String args[])
	{
		//CRIANDO OBJETOS
		aviao aviao1 =  new aviao("particular",70,33,51,2500,350);
		aviao aviao2 = new aviao("express",62,33,53,2500,550);
		
		//USANDO SET E GET PARA AVIAO2
		
		/*aviao2.setModelo("express");
		aviao2.setComprimento(62);
		aviao2.setNassentos(33);
		aviao2.setNserie(533);
		aviao2.setAlturamaxima(2500);
		aviao2.setVelocidademaxima(550);*/
		
		aviao1.printaaviao();
		System.out.println("\n");
		aviao2.printaaviao();
		
	}
}
