package entities;

public class Comprador extends Funcionario implements AtivandoEstoque,Atuando{

	public Comprador(String nome, String matricula,String email) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}
		
	public void informacoesDoFuncionario() {
		System.out.println("== Comprador ==");
		System.out.println("O nome do funcionário: ".concat(getNome()));
		System.out.println("Email para contato: " .concat(getEmail()));
		System.out.println("Sua identificação: " .concat(getMatricula()));
		System.out.println("==============");

	}

	@Override
	public double calculandoBonificacao() {
		return this.getSalario() * 0.1 + 300;
	}
	
	public void colocandoNoSistema(String sistema) {
		System.out.println("Inserindo novo produto: " + sistema);
	}

	@Override
	public void alimentandoLoja(String produto) {
		System.out.println("Trazendo novos produtos: " + produto);		
	}

	@Override
	public String atuando() {
		return "Atualizando lista de produtos";
	}
}
