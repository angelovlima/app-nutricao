package br.com.fatec.appnutricao.model.alimento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InformacaoNutricional {

	private String nome;
	
	private double quantidade;
	
	private double valorDiario;
}
