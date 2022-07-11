package entities;

public abstract class Funcionario {
	
	protected String nome;
	protected String matricula;
	protected String email;
	protected Double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, String matricula, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public Funcionario(String email) {
		super();
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calculandoBonificacao();
}
