package Exercicios6;

public class aviao 
{
	private String modelo;
	private float comprimento;
	private int nassentos;
	private int nserie;		//criando atributos
	private float alturamaxima;
	private int velocidademaxima;
	
	public aviao (String modelo,float comprimento, int nassentos, int nseries, float alturamaxima,int velocidademaxima)
	{
		this.modelo = modelo;
		this.comprimento = comprimento;
		this.nassentos = nassentos;
		this.nserie = nseries; // PQ SEM O S NÃO FUNCIONA???
		this.alturamaxima = alturamaxima;
		this.velocidademaxima = velocidademaxima;
	}
			//CRIANDO MÉTODO
		public void printaaviao()
		{
			System.out.println("Aviao: "+modelo);
			System.out.println("Comprimento: "+comprimento+" metros");
			System.out.println("Número de assentos: "+nassentos);
			System.out.println("Número de série: "+nserie);
			System.out.println("Peso: "+alturamaxima+" metros");
			System.out.println("Velocidade máxima: "+velocidademaxima+"km/h");
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public float getComprimento() {
			return comprimento;
		}
		public void setComprimento(float comprimento) {
			this.comprimento = comprimento;
		}
		public int getNassentos() {
			return nassentos;
		}
		public void setNassentos(int nassentos) {
			this.nassentos = nassentos;
		}
		public int getNserie() {
			return nserie;
		}
		public void setNserie(int nserie) {
			this.nserie = nserie;
		}
		public float getAlturamaxima() {
			return alturamaxima;
		}
		public void setAlturamaxima(float alturamaxima) {
			this.alturamaxima = alturamaxima;
		}
		public int getVelocidademaxima() {
			return velocidademaxima;
		}
		public void setVelocidademaxima(int i) {
			this.velocidademaxima = i;
		}
		
}
