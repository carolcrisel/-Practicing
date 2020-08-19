package polimorfismo;

public class pessoajuridica extends pessoa1
{
	private long cnpj;
	public pessoajuridica (){
		{
			
		}
	}
	public long getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String.getNome()//VERIFICAR ESTE ERRO
	{
		return "Pessoa juridica: "+super.getNome()+" "+cnpj+this.getCnpj();
	}
	
}
