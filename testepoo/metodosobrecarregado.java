package testepoo;

public class metodosobrecarregado 
{
	public void testametodossobrecarregados()
	{
		System.out.printf("Salário em número inteiro: %d \n",salario(1000));
		System.out.printf("Salário em número double : %f \n",salario(7.500));
	}
	public int salario(int valorint)
	{
		System.out.printf("Salário com argumento inteiro: %d \n",valorint);
		return valorint * valorint;
	}
	public double salario(double valordouble)
	{
		System.out.printf("Salário com argumento double: %f \n",valordouble);
		return valordouble * valordouble;
	}
}
  