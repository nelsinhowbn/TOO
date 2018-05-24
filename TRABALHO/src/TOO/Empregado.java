package TOO;

public class Empregado extends Pessoa 
{

private String endereco;
private float salario;

public Empregado (String nome)
{
	this.setNome(nome);
}

public String setEndereco(String endereco)
{
	return endereco; 
}

public void getEndereco() 
{
	this.endereco = endereco;
}

public float getSalario() 
{
	return salario;
}

public void setSalario(float salario) 
{
	this.salario = salario;
}

public void exibirDados()
{
	System.out.print("Nome: " + this.getNome());
}
 
}
















}

