package models;

public abstract class Endere�os extends Nome{
	
	private String endereco;
	private int telefone;
	private String email;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Endereco: " + getEndereco() + " | Telefone: " + getTelefone() + " | Email: " + getEmail();
	} 

}
