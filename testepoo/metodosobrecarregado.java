package testepoo;

public class metodosobrecarregado 
{
	public void testametodossobrecarregados()
	{
		System.out.printf("Sal�rio em n�mero inteiro: %d \n",salario(1000));
		System.out.printf("Sal�rio em n�mero double : %f \n",salario(7.500));
	}
	public int salario(int valorint)
	{
		System.out.printf("Sal�rio com argumento inteiro: %d \n",valorint);
		return valorint * valorint;
	}
	public double salario(double valordouble)
	{
		System.out.printf("Sal�rio com argumento double: %f \n",valordouble);
		return valordouble * valordouble;
	}
}
  