 package testepoo;

public class testecarro 
{
	public static void main (String args[])
	{
	carro meucarro = new carro();
	meucarro.cor = "vermelho";
	meucarro.modelo = "Passat";
	meucarro.velocidadeatual = 0;
	meucarro.velocidademaxima = 80;
	
	meucarro.liga();
	
	meucarro.acelera(20);
	System.out.println(meucarro.velocidadeatual);
	}
}
