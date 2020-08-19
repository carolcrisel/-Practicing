package POO;

public class pessoa 
{
	private String primeironome;//atributos da classe pessoa
	private String ultimonome;
	private String nomesdomeio;
	
	public pessoa (String primeiro,String meio, String ultimo) //Criando um construtor
	{
		primeironome = primeiro;//esses são os atributos
		ultimonome = ultimo;
		nomesdomeio = meio;
	}
	public String getnomecompleto()//método que vai retornar o nome completo
	{
		String nomecompleto = primeironome+" "+nomesdomeio+" "+ultimonome;
		return nomecompleto;
	}
}
