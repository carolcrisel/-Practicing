package encapsulamentoeheranca;

public class funcionario1 extends pessoa {
	private String departamento;
	
	public funcionario1 (String nome,int matricula,String departamento)
	{
		 super(nome, matricula);  //criando rela��o com a superclass
		 this.departamento =  departamento; // da classe funcion�rio 1
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
