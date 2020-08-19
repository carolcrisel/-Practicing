package testepoo;

public class carro 
{
	String cor;//criando atributos da classe carro
	String modelo;
	double velocidadeatual;
	double velocidademaxima;
	
	void liga()
	{
		System.out.println("O carro esta ligado.");
	}
	void acelera(double quantidade)
	{
		double velocidadenova = this.velocidadeatual+quantidade;
		this.velocidadeatual = velocidadenova;
	}
	int pegamarcha()
	{
		if(this.velocidadeatual<0)
		{
			return -1;
		}
		if(this.velocidadeatual>=0 && this.velocidadeatual<40)
		{
			return 1;
		}
		if (this.velocidadeatual>=40 && this.velocidadeatual<80)
		{
			return 2;
		}
		return 3;
	}
}
