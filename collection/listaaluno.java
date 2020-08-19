package collection;

import java.util.HashSet;
import java.util.Set;

public class listaaluno 
{
	public static void main (String args[])
	{
		Set <aluno> conjunto = new HashSet <aluno>();
		aluno a = new aluno("João da Silva", "JAVA ",6.8);
		aluno b = new aluno("Maria", "JAVA ",7.8);
		aluno c = new aluno("Renata", "JAVA ",8.8);
		aluno d = new aluno("zé Pedro", "JAVA ",5.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	} 
	
}
