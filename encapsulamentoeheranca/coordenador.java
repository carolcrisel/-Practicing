package encapsulamentoeheranca;

public class coordenador extends pessoa{
	private String cursocoordenado;
	
	public coordenador (String nome,int matricula ,String cursocoordenado)
	{
		super(nome,matricula);
		this.cursocoordenado = cursocoordenado;
	}

	public String getCursocoordenado() {
		return cursocoordenado;
	}

	public void setCursocoordenado(String cursocoordenado) {
		this.cursocoordenado = cursocoordenado;
	}
	
}
