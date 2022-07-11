package entities;

public class Gerente extends Funcionario implements Gerenciando,Atuando{
	
		
	public Gerente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
		
	}
	
	public void informacoesDoFuncionario() {
		System.out.println("== Gerente ==");
		System.out.println("O nome do funcionário: ".concat(getNome()));
		System.out.println("Email para contato: " .concat(getEmail()));
		System.out.println("==============");

	}

	@Override
	public double calculandoBonificacao() {
        return this.getSalario() * 0.6 + 100;
    }

	@Override
	public void verificandoFluxoDeAtividades(String gerindo) {
		System.out.println("Atividades da loja: " + gerindo);		
	}

	@Override
	public String atuando() {
		return "Metas alcançadas!";
	}
}
