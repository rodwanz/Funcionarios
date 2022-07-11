package application;

import entities.Comprador;
import entities.Estoquista;
import entities.Gerente;
import entities.Vendedor;

public class ProgramaFuncionarios {

	public static void main(String[] args) {
		
		System.out.println("Atividade do Comprador");
		Comprador cp = new Comprador("Carlos Augusto", "45.567-1", "carlaug@gmail.com");
		cp.alimentandoLoja("Nova linha de chimelos Rex.");
		cp.colocandoNoSistema("Tênis Voraxx.");
		System.out.println("Controle: " + cp.atuando());
		cp.setSalario(3450.00);
		System.out.println("Bonificação por meta alcançada: " + cp.calculandoBonificacao());
		
		cp.informacoesDoFuncionario();
		
		System.out.println("Fluxo do Estoque");
		Estoquista est = new Estoquista("Bruno Vieira", "44.566-1", "bv@gmail.com");
		est.trabalhando("Trazendo produto vendido.");
		est.setSalario(2100);
		System.out.println("Bonificação por meta alcançada: " + est.calculandoBonificacao());
		System.out.println("Por trabalhar em área enclausurada recebe periculosidade: " + est.calculoDePericulosidade());
		
		est.informacoesDoFuncionario();
		
		System.out.println("Vendas em movimento");
		Vendedor vend = new Vendedor("Roberio Almeida","robal@gmail.com" ,"44.567-1");
		System.out.println("Buscando por produto: " + vend.atuando());
		vend.verificandoNoSistema("T-shirt anti transpiração. ");
		vend.setSalario(3250);
		System.out.println("Bonificação por meta alcançada: " + vend.calculandoBonificacao());
		
		vend.informacoesDoFuncionario();
		
		System.out.println("Gerência ligada");
		Gerente gr = new Gerente("Leandro Vaz", "vazleo@gmail.com");
		gr.verificandoFluxoDeAtividades("Rendimento em alta!");
		System.out.println("Status da equipe: " + gr.atuando());
		
		gr.informacoesDoFuncionario();

	}
}
