package adaptandoprojeto;

public class matriculat extends academiat{


	private int matricula;//criar mais tipo rg id ******
	private long id;
	private long cpf;
	
	public matriculat (String nome, int idade, double altura, double peso,int matricula,long id,long cpf)
	{

		super(nome,idade,altura,peso,op2,op3,tmb,ndc1,ndc2,ndc3);
		this.matricula = matricula;
		this.id = id;
		this.cpf =cpf;
	}
	//criando get e set

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
}
