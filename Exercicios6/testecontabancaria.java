package Exercicios6;

public class testecontabancaria 
{
	public static void main(String args[])
	{
		contabancaria conta= new contabancaria("Cecílio",9523,"kdfw");
		
		System.out.println(conta.imprimirInfo());
		conta.depositar(25);
		conta.sacar(7500.50);
	}
}
