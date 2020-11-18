package br.com.fatec.appnutricao;

import java.util.List;
import java.util.Scanner;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;
import br.com.fatec.appnutricao.services.BaseDados;

public class Menu {
	
	public void menu() {
		
		BaseDados baseDados = new BaseDados();
		TabelaNutricional tabelaNutricional = baseDados.popularTabelaNutricional();
		List<Alimento> alimentos = baseDados.popularListaAlimentos();

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
					+ "1: Cadastrar Bovino \n" + "2: Cadastrar Suino \n" + "3: Checar preço de algum Animal \n"
					+ "4: Checar a quantidade de Animais Cadastrados \n" + "5: Checar preço total do Rebanho \n"
					+ "6: Checar o peso total do Rebanho \n" + "7: Checar animais por Gênero \n"
					+ "8: Checar a Porcentagem do rebanho Vacinado e quantos Faltam Vacinar \n"
					+ "9: Vender Animal \n");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
			}
		}
	}
}
