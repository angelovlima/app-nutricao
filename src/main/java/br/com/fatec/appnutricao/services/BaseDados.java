package br.com.fatec.appnutricao.services;

import java.util.ArrayList;
import java.util.List;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;

public class BaseDados {


	public List<InformacaoNutricional> popularInformacaoNutricional() { 
		List<InformacaoNutricional> informacoesNutricionais = new ArrayList<InformacaoNutricional>();
		InformacaoNutricional calorias = new InformacaoNutricional("Valor calórico");
		informacoesNutricionais.add(calorias);
		InformacaoNutricional carboidratos = new InformacaoNutricional("Carboidratos");
		informacoesNutricionais.add(carboidratos);
		InformacaoNutricional proteinas = new InformacaoNutricional("Proteínas");
		informacoesNutricionais.add(proteinas);
		InformacaoNutricional gordurasTotais = new InformacaoNutricional("Gorduras totais");
		informacoesNutricionais.add(gordurasTotais);
		InformacaoNutricional gordurasSaturadas = new InformacaoNutricional("Gorduras saturadas");
		informacoesNutricionais.add(gordurasSaturadas);
		InformacaoNutricional gordurasTrans = new InformacaoNutricional("Gorduras trans");
		informacoesNutricionais.add(gordurasTrans);
		InformacaoNutricional fibraAlimentar = new InformacaoNutricional("Fibra alimentar");
		informacoesNutricionais.add(fibraAlimentar);
		InformacaoNutricional sodio = new InformacaoNutricional("Sódio");
		informacoesNutricionais.add(sodio);
		
		return informacoesNutricionais; 
	}
	
	public TabelaNutricional popularTabelaNutricional() { 
		TabelaNutricional tabelaNutricional = new TabelaNutricional();
		tabelaNutricional.setInformacoesNutricionais(popularInformacaoNutricional());
		return tabelaNutricional; 
	}
	
	//Continuar daqui
	public List<Alimento> popularListaAlimentos() {
		TabelaNutricional tabelaNutricional = popularTabelaNutricional();
		TabelaNutricional tabelaNutricionalClone = new TabelaNutricional();
		tabelaNutricionalClone.setInformacoesNutricionais(tabelaNutricional.getInformacoesNutricionais());
		List<Alimento> alimentos = new ArrayList<Alimento>();
		Alimento alimento1 = new Alimento("1", "Leite", tabelaNutricional);
		Alimento alimento2 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento3 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento4 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento5 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento6 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento7 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento8 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento9 = new Alimento("1", "", tabelaNutricional);
		Alimento alimento10 = new Alimento("1", "", tabelaNutricional);
		return alimentos;
	}

}
