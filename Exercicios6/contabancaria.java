package Exercicios6;

public class contabancaria 
{	//criando atributos
	private String nomedoassociado;
	private double saldo;
	private String senhadeletras;
	//criando construtor
	public contabancaria(String nomedoassociado,double saldo,String senhadeletras)
	{
		this.nomedoassociado = nomedoassociado;
		this.saldo = saldo;
		this.senhadeletras = senhadeletras;
	}
	
	public String imprimirInfo()
	{
		return nomedoassociado + "O saldo disponível é: "+saldo;
	}
	
	public void depositar(double valor)
	{
		saldo = saldo + valor;
		System.out.println(" Novo saldo disponível: "+saldo);
	}
	public void sacar (double valor)
	{
		saldo =  saldo-valor;
		System.out.println("Novo saldo disponível: "+saldo);
	}

	public String getNomedoassociado() {
		return nomedoassociado;
	}

	public void setNomedoassociado(String nomedoassociado) {
		this.nomedoassociado = nomedoassociado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenhadeletras() {
		return senhadeletras;
	}

	public void setSenhadeletras(String senhadeletras) {
		this.senhadeletras = senhadeletras;
	}
	
	//criando get e set 
	
	
}
