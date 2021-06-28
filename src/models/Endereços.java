package models;

public abstract class Endereços extends Nome{
	
	private String endereco;
	private String telefone;
	private String email;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
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
