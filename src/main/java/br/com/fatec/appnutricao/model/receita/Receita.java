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

	String tempo;
	
	String modoPreparo;
	
	List<Alimento> alimentos;
}
