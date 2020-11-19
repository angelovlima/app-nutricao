package br.com.fatec.appnutricao;

import java.util.ArrayList;
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

public class Menu {
	
	public void menu() {
		BaseDados baseDados = new BaseDados();
		TabelaNutricional tabelaNutricional = baseDados.popularTabelaNutricional();
		List<Alimento> alimentos = baseDados.popularListaAlimentos();
		List<Combinacao> combinacoes = new ArrayList<Combinacao>();
		List<Receita> receitas = new ArrayList<Receita>();
		CadastrarAlimento cadastrarAlimento = new CadastrarAlimento();
		CadastrarCombinacao cadastrarCombinacao = new CadastrarCombinacao();
		CadastrarReceita cadastrarReceita = new CadastrarReceita();
		
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
			case 2:
				cadastrarCombinacao.cadastrarCombinacao(alimentos, combinacoes);
			case 3:
				cadastrarReceita.cadastrarReceita(alimentos, receitas);
			case 4:
				
			case 5:
				
			case 6:
				
			default:
				break;
			}
		}
	}

}
