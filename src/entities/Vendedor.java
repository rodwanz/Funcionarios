package entities;

public class Vendedor extends Funcionario implements Atuando{
	
	public Vendedor(String nome,String email,String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}
	
	public void informacoesDoFuncionario() {
		System.out.println("== Vendedor ==");
		System.out.println("O nome do funcion�rio: ".concat(getNome()));
		System.out.println("Email para contato: " .concat(getEmail()));
		System.out.println("Sua identifica��o: " .concat(getMatricula()));
		System.out.println("==============");

	}

	@Override
	public double calculandoBonificacao() {
		return this.getSalario() * 0.1 + 300;
	}

	@Override
	public String atuando() {
		return "Produto encontrado";
	}
	
	public void verificandoNoSistema(String sistema) {
		System.out.println("Produto: " + sistema);
	}
}
