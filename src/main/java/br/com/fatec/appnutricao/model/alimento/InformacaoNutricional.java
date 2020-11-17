package br.com.fatec.appnutricao.model.alimento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InformacaoNutricional {

	double quantidade;
	
	double valorDiario;
}
