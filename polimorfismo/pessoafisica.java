package polimorfismo;

public class pessoafisica extends pessoa1 //crinado herança em cima de pessoa1
{
	private long cpf;
	public pessoafisica ()
		{
			
		}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome()
	{
		return "Pessoa física: "+super.getNome()+" "+cpf+this.getCpf();
	}
}
