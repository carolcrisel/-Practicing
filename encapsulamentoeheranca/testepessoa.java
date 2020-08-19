package encapsulamentoeheranca;

public class testepessoa {
	public static void main (String args[])
	{
		pessoa jessica = new pessoa("Jésica",555);
		funcionario1 pedro = new funcionario1("Pedro",222, "ti");
		pessoa Maria =  new funcionario1("Maria",333,"Infor-Deve");
		pessoa Jose = new coordenador ("Jose",444,"cc");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(Maria.getMatricula());
		System.out.println (Jose.getNome());
	}
}
