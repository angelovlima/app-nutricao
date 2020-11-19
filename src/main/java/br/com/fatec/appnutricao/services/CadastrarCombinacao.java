package br.com.fatec.appnutricao.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.combinacao.Combinacao;

public class CadastrarCombinacao {
	
	public void cadastrarCombinacao(List<Alimento> alimentosCadastrados, List<Combinacao> combinacoes) {
		
		Scanner sc = new Scanner(System.in);
		List<Alimento> alimentos = new ArrayList<Alimento>();
		String continuarCadastrar = "sim";
		
		System.out.println("Digite o nome da Nova Combinação: ");
		String nomeCombinacao = sc.nextLine();
		
		
		
		
		while(continuarCadastrar.equals("sim")) {
			boolean existeAlimento = false;
			
			System.out.println("Digite o nome do alimento que deseja colocar na Combinação: ");
			
			String nomeAlimento = sc.nextLine();
			for (Alimento alimento : alimentosCadastrados) {
				if(nomeAlimento.equals(alimento.getNome())) {
					alimentos.add(alimento);
					existeAlimento = true;
				}
			}
			
			if(!existeAlimento) {
				System.out.println("Não existe este alimento");
			}
			
			System.out.println("Deseja colocar outro igredientes na combinação? Se sim, digite 'sim'");
			continuarCadastrar = sc.nextLine();
			
		}
		
		
		
		Combinacao combinacao = new Combinacao(nomeCombinacao,alimentos);
		
		combinacoes.add(combinacao);
		
	}
}
