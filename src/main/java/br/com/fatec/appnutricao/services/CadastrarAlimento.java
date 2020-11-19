package br.com.fatec.appnutricao.services;

import java.util.List;
import java.util.Scanner;
import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.alimento.InformacaoNutricional;
import br.com.fatec.appnutricao.model.alimento.TabelaNutricional;

public class CadastrarAlimento {
	
	@SuppressWarnings("resource")
	public void cadastrarAlimento(List<Alimento> alimentosCadastrados, TabelaNutricional tabelaNutricional) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o grupo do alimento que deseja cadastrar:");
		System.out.println("Ex: 1 - Laticínios|2 - Carne|3 - Fruta e Verdura|4 - Grãos|5 - Gordura(vegetal ou animal)");
		String tipo = sc.nextLine();
		System.out.println("Digite o nome do alimento:");
		String nome = sc.nextLine();
		for(Alimento alimento: alimentosCadastrados) {
			if(nome.equalsIgnoreCase(alimento.getNome())) {
				System.out.println("Alimento já cadastrado. Tente novamente!");
				break;
			}
		}
		System.out.println("Cadastre os dados da tabela nutricional do alimento:");
		for(InformacaoNutricional item: tabelaNutricional.getInformacoesNutricionais()) {
			System.out.println(item.getNome());
			System.out.println("Digite a quantidade:");
			double quantidade = sc.nextDouble();
			item.setQuantidade(quantidade);
			System.out.println("Digite o valor diário:");
			double valorDiario = sc.nextDouble();
			item.setValorDiario(valorDiario);
			
			
			
		}
		
		Alimento alimentoUnidade = new Alimento(tipo, nome, tabelaNutricional);
		alimentosCadastrados.add(alimentoUnidade);
		
		
		
	}
}
