package projetoadriano;

import java.util.Scanner;

public class projetoacademia {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int op;//op��o de matricula.
		int op2;//op��o de objetivo.
		String nome;
		long cpf;
		long rg;
		String genero;
		int idade;
		float altura;
		float peso;
		long ca;//c�digo do aluno.
		
		System.out.println("O que deseja fazer? \n1 -- Cadastrar aluno \n2 -- Consultar situa��o do aluno");
		op = entrada.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Insira o nome");
			nome = entrada.next();
			System.out.println("Digite o CPF");
			cpf = entrada.nextLong();
			System.out.println("Digite o RG");
			rg = entrada.nextLong();
			System.out.println("Insira o g�nero");
			genero = entrada.next();
			System.out.println("Digite a idade");
			idade = entrada.nextInt();
			System.out.println("Digite o peso atual (em quilogramas)");
			altura = entrada.nextFloat();
			System.out.println("Digite a altura (em metros)");
			peso = entrada.nextFloat();
			
			System.out.println("Nome: "+nome);
			System.out.println("CPF: "+cpf);
			System.out.println("RG: "+rg);
			System.out.println("G�nero: "+genero);
			System.out.println("Idade: "+idade+" anos");
			System.out.println("Altura: "+altura+" m");
			System.out.println("Peso atual: "+peso+" kg");
			
			System.out.println("\n\nQual seu objetivo? \n1 -- Ganho de massa muscular \n2 -- Perda de peso \n3 -- Condicionamento f�sico");
			op2 = entrada.nextInt();
			
			switch (op2) {
			case 1:
				System.out.println("O mais indicado para o inv�duo � focar em treinos com pesos, priorizar treinos com menos repeti��es e mais intensidade, \natividade cardiovascular ap�s a atividade com peso, de prefer�ncia atividades com baixa intensidade card�aca. \nConsuma alimentos com alto �ndice glic�mico e alta ingest�o de prote�na");
				break;
			case 2:
				System.out.println("O mais indicado para quem quer perder peso � focar em atividade cardiovasculares e atividade com pesos (focar em mais repeti��es e menos intensidade). \nConsuma alimentos com alto �ndice glic�mico e alta ingest�o de prote�na");
				break;
			case 3:
				System.out.println("O mais indicado para quem quer melhorar seu condicionamento f�sico � focar em atividade cardiovasculares e atividade com pesos (focar em mais repeti��es e menos intensidade). \nConsuma alimentos com alto �ndice glic�mico e alta ingest�o de prote�na");
				break;
			}
			
			break;
		case 2:
			System.out.println("Insira o c�digo do aluno");
			ca = entrada.nextLong();
			
			System.out.println("Aluno matriculado desde 30/01/2020.\nNenhum d�bito em aberto.");
			break;
		}
	}
}