package br.com.fatec.appnutricao.services;

import java.util.Scanner;

public class CalculadorCorporal {
	
	public double calcularIMC() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura*altura);
		
		return imc;
	}
}
