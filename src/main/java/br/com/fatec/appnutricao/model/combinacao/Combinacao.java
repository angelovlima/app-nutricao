package br.com.fatec.appnutricao.model.combinacao;

import java.util.List;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Combinacao {
	
	private String nome;
	
	private List<Alimento> alimentos;
}
