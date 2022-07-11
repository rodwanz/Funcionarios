package entities;

public class Estoquista extends Funcionario implements Trabalhando{
	
	public Estoquista(String nome, String matricula, String email) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}
	
	public void informacoesDoFuncionario() {
		System.out.println("== Estoquista ==");
		System.out.println("O nome do funcionário: ".concat(getNome()));
		System.out.println("Email para contato: " .concat(getEmail()));
		System.out.println("Sua identificação: " .concat(getMatricula()));
		System.out.println("==============");

	}
	
	@Override
	public double calculandoBonificacao() {
		return this.getSalario() * 0.1;
	}
		
	public double calculoDePericulosidade() {
		return this.getSalario() * 0.3;
	}

	@Override
	public void trabalhando(String estoque) {
		System.out.println("Movimentando estoque: " + estoque);
	}
}
