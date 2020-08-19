package Exercicios6;

public class contab 
{
		public static Scanner s = new Scanner (System.in);
		//criando atributos
		private String nome;
		private double saldo;
		private int conta;
		private int agencia;
		//criando construtor
		public contab(String nome,double saldo, int conta, int agencia)
		{
			this.nome = nome;
			this.saldo =  saldo;
			this.conta = conta;
			this.agencia = agencia;
		}
		public contab()  {}
		
		public boolean deposito (double valor) {
			if(valor<=0) {
				System.out.println("Erro");
				return false;
			}
			else
				this.saldo += valor;
			System.out.printf("Depósito realizado com sucesso.\nSaldo atual: R$%.2f\n",this.saldo);
			return true;
		}
}
