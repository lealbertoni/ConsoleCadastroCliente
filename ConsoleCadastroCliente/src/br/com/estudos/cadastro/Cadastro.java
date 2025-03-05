package br.com.estudos.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
	
	public static void main(String[] args) {
		
		List<Cliente> cadastro = new ArrayList<>();

		Scanner scn = new Scanner(System.in);		
		
		while(true) {
			System.out.println("1- Cadastro");
			System.out.println("2- Listar");
			System.out.println("3- Sair");
			
			String escolha = scn.nextLine();
			
			switch(escolha) {
				case "1":
					System.out.println("Digite o seu nome: ");
					String nome = scn.nextLine();
					System.out.println("Digite a sua data de nascimento (dd/mm/aaaa): ");
					String data = scn.nextLine();
					cadastro.add(new Cliente(nome, data));
					break;
				case "2":
					System.out.println(cadastro);
					break;
				case "3":
					System.out.println("Finalizando o programa!");
					scn.close();
					System.exit(0);
					break;
				default:
			  		System.out.print("Opção Inválida!\n");
			  		break;
			}			
		}
	}
}
