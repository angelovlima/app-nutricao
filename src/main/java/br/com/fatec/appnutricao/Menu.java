package br.com.fatec.appnutricao;

import java.util.Scanner;

public class Menu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		int menu = 1000;
		
		while(menu != 0) {
			
			System.out.println("\n+++++++++++++++++++++++MENU+++++++++++++++++++++++ \n" + "0: Sair \n"
					+ "1: Cadastrar Bovino \n" + "2: Cadastrar Suino \n" + "3: Checar preço de algum Animal \n"
					+ "4: Checar a quantidade de Animais Cadastrados \n" + "5: Checar preço total do Rebanho \n"
					+ "6: Checar o peso total do Rebanho \n" + "7: Checar animais por Gênero \n"
					+ "8: Checar a Porcentagem do rebanho Vacinado e quantos Faltam Vacinar \n"
					+ "9: Vender Animal \n");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
			}
		}
	}
}
