package br.com.fatec.appnutricao.model.alimento;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TabelaNutricional {
	
	public TabelaNutricional(TabelaNutricional tabelaNutricional) {
		this.informacoesNutricionais = tabelaNutricional.getInformacoesNutricionais();
	}

	private List<InformacaoNutricional> informacoesNutricionais;
}
