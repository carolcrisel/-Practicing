package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class colecoes 
{
	public static void main (String args[])
	{
		Collection <String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Miguel");
		nomes.add("Rafaela");
		Collection <String> nomes2 = Arrays.asList("Mariana","Joana");
		
		for(String name : nomes)
		{
			System.out.println("Lista de nome: "+name);
		}
		
		/*nomes.addAll(nomes2);//adicionando para lista
		System.out.println("Lista de nome: "+nomes);*/
		
		/*System.out.println("Contém o nome Maria?  " + nomes.contains("Maria"));//verificação de dados
		System.out.println("Lista de nome: "+nomes);*/
		
		/*System.out.println("Lista de nome: "+nomes);
		nomes.clear();//limpar todos os campos da lista
		System.out.println("Lista de nome: "+nomes);*/
		
		/*System.out.println("Lista de nome: "+nomes);
		nomes.remove("Mario");//removendo item da lista
		System.out.println("Lista de nome: "+nomes);*/
		
		
		/* if(nomes.isEmpty())//verificação de lista vazia
		{
			System.out.println("Lista vazia.");
		}
		
		else
		{
			System.out.println("Lista de nome: "+nomes); 
		}*/
		
		
	}
}
