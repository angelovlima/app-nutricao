package br.com.fatec.appnutricao.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.appnutricao.model.alimento.Alimento;
import br.com.fatec.appnutricao.model.receita.Receita;
public class CadastrarReceita {
	
	public Receita cadastrarReceita(List<Alimento> alimentosCadastrados) {
		
		List <Alimento> alimentos = new ArrayList<Alimento>();
		String continuarCadastrar = "sim";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome da receita: ");
		String nome = sc.nextLine();
		System.out.println("Modo de preparo: ");
		String modoPreparo = sc.nextLine();
		System.out.println("Tempo de preparo: ");
		String tempo = sc.nextLine();
		
		while(continuarCadastrar.equals("sim")) {
			boolean existeAlimento = false;
			
			System.out.println("Nome do alimento: ");
			
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
			
			System.out.println("Deseja colocar outros igredientes na receita? Se sim, digite 'sim'");
			continuarCadastrar = sc.nextLine();
			
		}
				
		Receita receita = new Receita(nome, modoPreparo, tempo, alimentos);
		return receita;
	}

}
