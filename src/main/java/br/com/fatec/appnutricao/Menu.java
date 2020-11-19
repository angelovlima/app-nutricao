package br.com.fatec.appnutricao;

import java.util.List;
import java.util.Scanner;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;
import br.com.fatec.appnutricao.services.BaseDados;
import br.com.fatec.appnutricao.services.CadastrarAlimento;
import br.com.fatec.appnutricao.services.CadastrarCombinacao;
import br.com.fatec.appnutricao.services.CadastrarReceita;
import br.com.fatec.appnutricao.services.Relatorios;

public class Menu {
	
	public void menu() {
		
		Relatorios relatorios = new Relatorios();
		BaseDados baseDados = new BaseDados();
		TabelaNutricional tabelaNutricional = baseDados.popularTabelaNutricional();
		List<Alimento> alimentos = baseDados.popularListaAlimentos();
		CadastrarAlimento cadastrarAlimento = new CadastrarAlimento();
		CadastrarCombinacao cadastrarCombinacao = new CadastrarCombinacao();
		CadastrarReceita cadastrarReceita = new CadastrarReceita();

//		for (Alimento alimento : alimentos) {
//			TabelaNutricional tabelaNutricionalAlimento = alimento.getTabelaNutricional();
//			for (InformacaoNutricional informacaoNutricional : tabelaNutricionalAlimento.getInformacoesNutricionais()) {
//				System.out.println(informacaoNutricional.getNome() + ": " + informacaoNutricional.getQuantidade() + " " + informacaoNutricional.getUnidadeMedida());
//				System.out.println("Valor diário: " + informacaoNutricional.getValorDiario() + "%\n");
//			}
//		}
		
		System.out.println("######## TESTE DE TABELA NUTRICIONAL ########\n\n");
		for (InformacaoNutricional item : tabelaNutricional.getInformacoesNutricionais()) {
			System.out.println("Nome: " + item.getNome() + "\n");
		}
		
		Scanner sc = new Scanner(System.in);
		int menu = 1000;
		
		while(menu != 0) {
			
			System.out.println("\n+++++++++++++++++++++++MENU+++++++++++++++++++++++ \n" + "0: Sair \n"
					+ "1: Cadastrar Alimento \n" + "2: Cadastrar Combinação \n" + "3: Cadastrar Receita \n"
					+ "4: Relatório de Alimentos \n" + "5: Relatório de Combinações \n"
					+ "6: Relatório de Refeições \n");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				cadastrarAlimento.cadastrarAlimento(alimentos, tabelaNutricional);
				break;
			case 2:
				cadastrarCombinacao.cadastrarCombinacao(alimentos);
				break;
			case 3:
				cadastrarReceita.cadastrarReceita(alimentos);
				break;
			case 4:
				relatorios.printarAlimentos(alimentos);
			case 5:
				relatorios.printarCombinacoes(combinacoes);
			case 6:
				relatorios.printarReceitas(receitas);
			default:
				break;
			}
		}
	}

}
