package br.com.fatec.appnutricao.model.alimento;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TabelaNutricional {

	private List<InformacaoNutricional> informacoesNutricionais;
}
