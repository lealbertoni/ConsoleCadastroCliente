package br.com.estudos.cadastro;

public class Cliente {
	private String nome;
	private String dataNascimento;
	
	public Cliente(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	@Override	
	public String toString() {
		return "{\"nome\": \"" + nome + "\", \"dataNascimento\": \"" + dataNascimento + "\"}";
	}
}
