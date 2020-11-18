package br.com.fatec.appnutricao.model.alimento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InformacaoNutricional {

	private String nome;
	
	private String unidadeMedida;
	
	private double quantidade;
	
	private double valorDiario;

	public InformacaoNutricional(String nome) {
		this.nome = nome;
	}
	
	public InformacaoNutricional(String nome, String unidadeMedida) {
		this.nome = nome;
		this.unidadeMedida = unidadeMedida;
	}
	
	
}
