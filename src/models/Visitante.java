package models;

public class Visitante extends Nome {

	private int idade;
	private double altura;
	private double peso;
	private String cpf;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + " | Idade: " + getIdade() + " | Altura: " + getAltura() + " | Peso: " + getPeso() + " | CPF: " + getCpf();
	}

}