package br.com.fatec.appnutricao.model.receita;

import java.util.List;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Receita {
	private String nome;

	private String tempo;
	
	private String modoPreparo;
	
	private List<Alimento> alimentos;
}
