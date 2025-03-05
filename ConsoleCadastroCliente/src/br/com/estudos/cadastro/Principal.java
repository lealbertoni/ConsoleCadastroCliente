package br.com.estudos.cadastro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		List<String> resultado = new ArrayList<>();
		
		while(true) {		
			
			System.out.println("1- Nome");
			System.out.println("2- Listar");
			System.out.println("3- Sair");
			String escolha = console.next();
			
			switch (escolha) {
				case "1":
					System.out.println("Digite seu nome: ");
					String nome = console.next();
					resultado.add(nome);
					break;
				case "2":
					System.out.println(resultado);
					break;
				case "3":
					console.close();
					System.exit(0);
					break;
				default:
			  		System.out.print("Opção Inválida!\n");
			  		break;
			}
		}

	}

}
