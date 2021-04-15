package models;

public class Parque {

	public Parque() { //construtor
		
	}

	//Atributos
	private int id;
	private String nome;
	private String cnpj;
	private String endereco;
	private int telefone;
	private String email;
	private String site;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " | CNPJ: " + cnpj + " | Endereço: " + endereco + " | Telefone: " + telefone + " | Email: " + email + "| Site: " + site;
	}
	
	
}
