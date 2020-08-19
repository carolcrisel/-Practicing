package POOinterface;

public class testeinterface {
	
	public static void main (String args[])
	{
		participanteforum participante =  new participanteforum();
		leitor leitorr = participante;
		System.out.println("O participante está lendo: "+leitorr.lendo());
		programador  programadorr =  participante;
		String java = "JAVA";
		programadorr.pensando(java.toCharArray());
		System.out.println("E programador: "+programadorr.digitando()); 
	}

}
