package Exercicios6;

public class cliente 
{
	private String nomecliente;//criando atributos
	private int cadastrocliente;
	private long telefonecliente;
	
	public cliente (String nomecliente, int cadastrocliente, long telefonecliente) //criando construtor
	{
		this.nomecliente = nomecliente;
		this.cadastrocliente = cadastrocliente;
		this.telefonecliente = telefonecliente;
	}
	
	public void printacliente() // criando método
	{
		System.out.println("Cliente: "+nomecliente);
		System.out.println("Número de cadastro: "+cadastrocliente);
		System.out.println("Telefone do cliente: "+telefonecliente);
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public int getCadastrocliente() {
		return cadastrocliente;
	}

	public void setCadastrocliente(int cadastrocliente) {
		this.cadastrocliente = cadastrocliente;
	}

	public long getTelefonecliente() {
		return telefonecliente;
	}

	public void setTelefonecliente(long telefonecliente) {
		this.telefonecliente = telefonecliente;
	}
	
}
