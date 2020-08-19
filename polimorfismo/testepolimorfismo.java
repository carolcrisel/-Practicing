package polimorfismo;

public class testepolimorfismo {
	public static void main (String args[])
	{
		pessoafisica fisica =  new pessoafisica();
		fisica.setNome(Juliana);
		fisica.setCpf(12345678902L);//ESSE "L" É PRA INDICAR QUE É DO TIPO LONG
		
		pessoajuridica juridica= new pessoajuridica();
		juridica.setNome("Olivia");
		juridica.setCnpj(12312312312L);
		
		pessoa1 pessoas = new pessoa1[2];
		pessoas[0]=pessoafisica;
		pessoas[1]=pessoajuridica;//PRECISO TERMINAR ESTA AULA E EXEMPLO
	}
}
