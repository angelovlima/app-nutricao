package br.com.fatec.appnutricao.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;
import br.com.fatec.appnutricao.model.combinacao.Combinacao;
import br.com.fatec.appnutricao.model.receita.Receita;

public class BaseDados {


	public List<InformacaoNutricional> popularInformacaoNutricional() { 
		List<InformacaoNutricional> informacoesNutricionais = new ArrayList<InformacaoNutricional>();
		InformacaoNutricional calorias = new InformacaoNutricional("Valor calórico","kcal");
		informacoesNutricionais.add(calorias);
		InformacaoNutricional carboidratos = new InformacaoNutricional("Carboidratos","g");
		informacoesNutricionais.add(carboidratos);
		InformacaoNutricional proteinas = new InformacaoNutricional("Proteínas","g");
		informacoesNutricionais.add(proteinas);
		InformacaoNutricional gordurasTotais = new InformacaoNutricional("Gorduras totais","g");
		informacoesNutricionais.add(gordurasTotais);
		InformacaoNutricional gordurasSaturadas = new InformacaoNutricional("Gorduras saturadas","g");
		informacoesNutricionais.add(gordurasSaturadas);
		InformacaoNutricional gordurasTrans = new InformacaoNutricional("Gorduras trans","g");
		informacoesNutricionais.add(gordurasTrans);
		InformacaoNutricional fibraAlimentar = new InformacaoNutricional("Fibra alimentar","g");
		informacoesNutricionais.add(fibraAlimentar);
		InformacaoNutricional sodio = new InformacaoNutricional("Sódio","mg");
		informacoesNutricionais.add(sodio);
		
		return informacoesNutricionais; 
	}
	
	public TabelaNutricional popularTabelaNutricional() { 
		TabelaNutricional tabelaNutricional = new TabelaNutricional();
		tabelaNutricional.setInformacoesNutricionais(popularInformacaoNutricional());
		return tabelaNutricional; 
	}
	
	public List<Alimento> popularListaAlimentos() {
		List<Alimento> alimentos = new ArrayList<Alimento>();
		
		Alimento alimento1 = new Alimento("1", "Leite", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento1);
		
		Alimento alimento2 = new Alimento("1", "Queijo", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento2);
		
		Alimento alimento3 = new Alimento("1", "Requeijão", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento3);
		
		Alimento alimento4 = new Alimento("1", "Iogurt", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento4);
		
		Alimento alimento5 = new Alimento("1", "Creme de Leite", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento5);
		
		Alimento alimento6 = new Alimento("1", "Leite Condesado", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento6);
		
		Alimento alimento7 = new Alimento("1", "Sorvete", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento7);
		
		Alimento alimento8 = new Alimento("1", "Doce de Leite", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento8);
		
		Alimento alimento9 = new Alimento("1", "Cream Cheese", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento9);
		
		Alimento alimento10 = new Alimento("1", "Manteiga", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento10);
		
		//------------------------------------------------------------------------------------
		
		Alimento alimento11 = new Alimento("2", "Carne de Vaca", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento11);
		
		Alimento alimento12 = new Alimento("2", "Carne de Porco", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento12);
		
		Alimento alimento13 = new Alimento("2", "Carne de Capivara", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento13);
		
		Alimento alimento14 = new Alimento("2", "Bacalhau", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento14);
		
		Alimento alimento15 = new Alimento("2", "Salmão", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento15);
		
		Alimento alimento16 = new Alimento("2", "Atum", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento16);
		
		Alimento alimento17 = new Alimento("2", "Ovo de Codorna", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento17);
		
		Alimento alimento18 = new Alimento("2", "Ovo", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento18);
		
		Alimento alimento19 = new Alimento("2", "Carne Seca", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento19);
		
		Alimento alimento20 = new Alimento("2", "Peixe Espada", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento20);
		
		//------------------------------------------------------------------------------------
		
		Alimento alimento21 = new Alimento("3", "Morango", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento21);
		
		Alimento alimento22 = new Alimento("3", "Abacaxi", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento22);
		
		Alimento alimento23 = new Alimento("3", "Uva", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento23);
		
		Alimento alimento24 = new Alimento("3", "Maça", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento24);
		
		Alimento alimento25 = new Alimento("3", "Mamão", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento25);
		
		Alimento alimento26 = new Alimento("3", "Banana", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento26);
		
		Alimento alimento27 = new Alimento("3", "Maracujá", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento27);
		
		Alimento alimento28 = new Alimento("3", "Melão", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento28);
		
		Alimento alimento29 = new Alimento("3", "Melancia", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento29);
		
		Alimento alimento30 = new Alimento("3", "Graviola", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento30);
		
		//------------------------------------------------------------------------------------
		
		Alimento alimento41 = new Alimento("4", "Macarrão", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento41);
		
		Alimento alimento42 = new Alimento("4", "Pão Francês", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento42);
		
		Alimento alimento43 = new Alimento("4", "Sequilhos", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento43);
		
		Alimento alimento44 = new Alimento("4", "Pão de Forma", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento44);
		
		Alimento alimento45 = new Alimento("4", "Mel", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento45);
		
		Alimento alimento46 = new Alimento("4", "Pão Careca", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento46);
		
		Alimento alimento47 = new Alimento("4", "Baguete", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento47);
		
		Alimento alimento48 = new Alimento("4", "Pão de Queijo", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento48);
		
		Alimento alimento49 = new Alimento("4", "Brioche", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento49);
		
		Alimento alimento50 = new Alimento("4", "Cereal", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento50);
		
		//------------------------------------------------------------------------------------
		
		Alimento alimento51 = new Alimento("5", "Azeite de Olvia", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento51);
		
		Alimento alimento52 = new Alimento("5", "Óleo de Abacate", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento52);
		
		Alimento alimento53 = new Alimento("5", "Óleo de Coco", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento53);
		
		Alimento alimento54 = new Alimento("5", "Margarina", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento54);
		
		Alimento alimento55 = new Alimento("5", "Manteiga Ghee", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento55);
		
		Alimento alimento56 = new Alimento("5", "Óleo de Canola", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento56);
		
		Alimento alimento57 = new Alimento("5", "Óleo de Linhaça", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento57);
		
		Alimento alimento58 = new Alimento("5", "Óleo de Girassol", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento58);
		
		Alimento alimento59 = new Alimento("5", "Óleo de Macadâmia", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento59);
		
		Alimento alimento60 = new Alimento("5", "Óleo de Soja", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento60);
		
		//------------------------------------------------------------------------------------
		
		return alimentos;
	}
	
	public TabelaNutricional popularTabelaNutricionalAleatoriamente() {
		TabelaNutricional tabelaNutricional = popularTabelaNutricional();
		Random gerador = new Random();
		for (InformacaoNutricional informacaoNutricional : tabelaNutricional.getInformacoesNutricionais()) {
			informacaoNutricional.setQuantidade((gerador.nextInt(500)+1)+((gerador.nextInt(10)+1)*0.1));
			informacaoNutricional.setValorDiario(gerador.nextInt(99)+1);
		}
		return tabelaNutricional;
	}
	
	public List<Combinacao> popularCombinacao(){
		List<Combinacao> combinacoes = new ArrayList<Combinacao>();
		List<Alimento> alimentos1 = new ArrayList<Alimento>();
		List<Alimento> alimentos2 = new ArrayList<Alimento>();
		
		Alimento alimento1 = new Alimento("1", "Sorvete", popularTabelaNutricionalAleatoriamente());
		alimentos1.add(alimento1);
		Alimento alimento2 = new Alimento("3", "Banana", popularTabelaNutricionalAleatoriamente());
		alimentos1.add(alimento2);
		
		Combinacao combinacao1 = new Combinacao("Sorvete com Banana", alimentos1);
		combinacoes.add(combinacao1);
		
		Alimento alimento3 = new Alimento("4", "Pão Francês", popularTabelaNutricionalAleatoriamente());
		alimentos2.add(alimento3);
		
		Alimento alimento4 = new Alimento("2", "Ovo", popularTabelaNutricionalAleatoriamente());
		alimentos2.add(alimento4);
		
		Combinacao combinacao2 = new Combinacao("Pão com Ovo", alimentos2);
		combinacoes.add(combinacao2);
		
		return combinacoes;
	}
	
	public List<Receita> popularReceita(){
		List<Receita> receitas = new ArrayList<Receita>();
		List<Alimento> alimentos = new ArrayList<Alimento>();
		Alimento alimento1 = new Alimento("1", "Creme de Leite", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento1);
		Alimento alimento2 = new Alimento("1", "Leite Condesado", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento2);
		Alimento alimento3 = new Alimento("3", "Maracujá", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento3);
		
		Receita receita1 = new Receita("Mousse de Maracujá","4 horas", "Em um liquidificador, bata o creme de leite, o leite condensado e o suco concentrado de maracujá. Em uma tigela, despeje a mistura e leve à geladeira por, no mínimo, 4 horas.", alimentos);
		receitas.add(receita1);
		return receitas;
	}

}
