package br.com.fatec.appnutricao.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;

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
		
		Alimento alimento3 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento3);
		
		Alimento alimento4 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento4);
		
		Alimento alimento5 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento5);
		
		Alimento alimento6 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento6);
		
		Alimento alimento7 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento7);
		
		Alimento alimento8 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento8);
		
		Alimento alimento9 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento9);
		
		Alimento alimento10 = new Alimento("1", "", popularTabelaNutricionalAleatoriamente());
		alimentos.add(alimento10);
		
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

}
