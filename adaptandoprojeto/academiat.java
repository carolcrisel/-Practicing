package adaptandoprojeto;

import java.util.Scanner;

public class academiat 
{	Scanner ler = new Scanner(System.in);
//criando atributos
private String nome;
private int idade;
private int genero;
private double altura;
private double peso;
private int op2;
private int op3;
private double tmb;
private double ndc1;
private double ndc2;
private double ndc3;
	//criando construtor
public academiat (String nome,int idade,String genero, double altura, double peso)
{
	this.nome = nome;
	this.idade = idade;
	//this.genero = genero;
	this.altura = altura;
	this.peso = peso;
}
	//criando m�todos
void chegou()
{
	System.out.println("Voc� est� na academia BOLO � BOM? \n "); 
}
void indicacao(int op)
	{
	this.genero = op;
	int op2;
	int op3;
	double tmb;
	double ndc1;
	double ndc2;
	double ndc3;
	System.out.println("Escolha g�nero: 1 -- Masculino \t2 -- feminino");
	switch (op) {
	case 1:
		tmb = 66.5 + (13.75*peso) + (5.0*altura) - (6.8*idade);
		System.out.printf("\nSua Taxa de Metabolismo Basal �: %.2f",tmb);
		
		System.out.println("\n\n\n\nCom qual frequ�ncia voc� pratica atividades f�sicas? \n\n1 -- Nenhuma atividade f�sica \n\n2 -- Atividade fis�ca moderada (meia hora de caminhada, nata��o ou bicicleta, quatro vezes por semana) \n\n3 -- Atividade f�sica intensa (uma hora de corrida, pelo menos quatro vezes por semana)	");
		op2 = ler.nextInt();
		
		switch (op2) {
		case 1:
			ndc1 = tmb + tmb*0.25;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc1,"." );
			break;
		case 2:
			ndc2 = tmb + tmb*0.35;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc2,"." );
			break;
		case 3:
			ndc3 = tmb + tmb*0.45;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc3,"." );
			break;
		}
	case 2:
		tmb = 665.1 + (9.56*peso) + (1.8*altura) - (4.7*idade);
		System.out.printf("\nSua Taxa de Metabolismo Basal �: %.2f",tmb);
			
		System.out.println("\n\n\n\nCom qual frequ�ncia voc� pratica atividades f�sicas? \n\n1 -- Nenhuma atividade f�sica \n\n2 -- Atividade fis�ca moderada (meia hora de caminhada, nata��o ou bicicleta, quatro vezes por semana) \n\n3 -- Atividade f�sica intensa (uma hora de corrida, pelo menos quatro vezes por semana)	");
		op2 = ler.nextInt();
			
		switch (op2) {
		case 1:
			ndc1 = tmb + tmb*0.20;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc1,"." );
			break;
		case 2:
			ndc2 = tmb + tmb*0.30;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc2,"." );
			break;
		case 3:
			ndc3 = tmb + tmb*0.40;
			System.out.printf("Sua Necessidade Di�ria de Calorias �: %.2f",ndc3,"." );
			break;
		
		}
	}
	}


	/*criando get e set 
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}*/
}

