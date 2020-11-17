package br.com.fatec.appnutricao.model.alimento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TabelaNutricional {

	InformacaoNutricional valorEnergetico;
	InformacaoNutricional carboidratos;
	InformacaoNutricional proteinas;
	InformacaoNutricional gordurasTotais;
	InformacaoNutricional gordurasSaturadas;
	InformacaoNutricional gordurasTrans;
	InformacaoNutricional fibraAlimentar;
	InformacaoNutricional sodio;
}
