package br.com.fatec.appnutricao;

import java.util.List;
import java.util.Scanner;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;
import br.com.fatec.appnutricao.model.combinacao.Combinacao;
import br.com.fatec.appnutricao.model.receita.Receita;
import br.com.fatec.appnutricao.services.BaseDados;
import br.com.fatec.appnutricao.services.CadastrarAlimento;
import br.com.fatec.appnutricao.services.CadastrarCombinacao;
import br.com.fatec.appnutricao.services.CadastrarReceita;
import br.com.fatec.appnutricao.services.CalculadorCorporal;
import br.com.fatec.appnutricao.services.Relatorios;

public class Menu {
	
	public void menu() {
		
		Relatorios relatorios = new Relatorios();
		BaseDados baseDados = new BaseDados();
		TabelaNutricional tabelaNutricional = baseDados.popularTabelaNutricional();
		List<Alimento> alimentos = baseDados.popularListaAlimentos();
		List<Combinacao> combinacoes = baseDados.popularCombinacao();
		List<Receita> receitas = baseDados.popularReceita();
		CadastrarAlimento cadastrarAlimento = new CadastrarAlimento();
		CadastrarCombinacao cadastrarCombinacao = new CadastrarCombinacao();
		CadastrarReceita cadastrarReceita = new CadastrarReceita();
		
		Scanner sc = new Scanner(System.in);
		int menu = 1000;
		
		while(menu != 0) {
			
			System.out.println("\n+++++++++++++++++++++++MENU+++++++++++++++++++++++ \n" + "0: Sair \n"
					+ "1: Cadastrar Alimento \n" + "2: Cadastrar Combinação \n" + "3: Cadastrar Receita \n"
					+ "4: Relatório de Alimentos \n" + "5: Relatório de Combinações \n"
					+ "6: Relatório de Refeições \n" + "7: Cálculo IMC\n");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				cadastrarAlimento.cadastrarAlimento(alimentos, tabelaNutricional);
				break;
			case 2:
				cadastrarCombinacao.cadastrarCombinacao(alimentos, combinacoes);
				break;
			case 3:
				cadastrarReceita.cadastrarReceita(alimentos, receitas);
				break;
			case 4:
				relatorios.printarAlimentos(alimentos);
				break;
			case 5:
				relatorios.printarCombinacoes(combinacoes);
				break;
			case 6:
				relatorios.printarReceitas(receitas);
				break;
			case 7:
				relatorios.printarImc();
				break;
			default:
				break;
			}
		}
	}

}
