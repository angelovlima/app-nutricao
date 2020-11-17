package br.com.fatec.appnutricao.services;

import java.util.Scanner;

import br.com.fatec.appnutricao.model.receita.Receita;

public class CadastrarReceita {
	
	public Receita cadastrarReceita() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		
		Receita receita = new Receita();
		return receita;
	}

}
