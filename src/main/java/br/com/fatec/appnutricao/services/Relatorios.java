package br.com.fatec.appnutricao.services;

import java.util.List;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;
import br.com.fatec.appnutricao.model.combinacao.Combinacao;
import br.com.fatec.appnutricao.model.receita.Receita;

public class Relatorios {

	public void printarAlimentos(List<Alimento> alimentos, String tipo) {
		if(tipo == null) {
			for (Alimento alimento : alimentos) {
				TabelaNutricional tabelaNutricionalAlimento = alimento.getTabelaNutricional();
				System.out.println("+++++++++++++++++" + alimento.getNome() + "+++++++++++++++++");
				System.out.println("Tipo: " + cadastrarAlimento.verificarTipo(alimento.getTipo()));
				
				
				for (InformacaoNutricional informacaoNutricional : tabelaNutricionalAlimento.getInformacoesNutricionais()) {
					System.out.println(informacaoNutricional.getNome() + ": " + informacaoNutricional.getQuantidade() + " " + informacaoNutricional.getUnidadeMedida());
					System.out.println("Valor diário: " + informacaoNutricional.getValorDiario() + "%\n");
				}
			}
		}else {
			for (Alimento alimento : alimentos) {
				if(tipo.equals(alimento.getTipo())) {
					TabelaNutricional tabelaNutricionalAlimento = alimento.getTabelaNutricional();
					System.out.println("+++++++++++++++++" + alimento.getNome() + "+++++++++++++++++");
					System.out.println("Tipo: " + cadastrarAlimento.verificarTipo(tipo));
					
					
					
					for (InformacaoNutricional informacaoNutricional : tabelaNutricionalAlimento.getInformacoesNutricionais()) {
						System.out.println(informacaoNutricional.getNome() + ": " + informacaoNutricional.getQuantidade() + " " + informacaoNutricional.getUnidadeMedida());
						System.out.println("Valor diário: " + informacaoNutricional.getValorDiario() + "%\n");
					}
				}
				
			}
		}
		
	}
	
	public void printarCombinacoes(List<Combinacao> combinacoes) {
		for(Combinacao combinacao : combinacoes) {
			System.out.println("\nNome: " + combinacao.getNome() + "\n");
			printarAlimentos(combinacao.getAlimentos(), null);
		}
	}
	
	public void printarReceitas(List<Receita> receitas) {
		for(Receita receita : receitas) {
			System.out.println("\nNome: " + receita.getNome() +
					"\nTempo de Preparo: " + receita.getTempo() +
					"\nModo de Preparo: " + receita.getModoPreparo());
			printarAlimentos(receita.getAlimentos(), null);
		}
	}
	
	public void printarImc() {
		System.out.println("+++++++++++++++++ Cálculo IMC +++++++++++++++++");
		Double imc = calculadorCorporal.calcularIMC();
		if(imc < 18.5) {
			System.out.println("Resultado: MAGREZA \n");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Resultado: NORMAL \n");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Resultado: SOBREPESO \n");
		} else if (imc >= 30.0 && imc <= 39.9) {
			System.out.println("Resultado: OBESIDADE \n");
		} else {
			System.out.println("Resultado: OBESIDADE GRAVE \n");
		}
		
	}
}
