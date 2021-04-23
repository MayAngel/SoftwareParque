package models;

//import java.sql.Date;

public class Servico {
	
	int id;
	String tipo;
	String nome;
	String descricao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	@Override
	public String toString() {
		return "ID:" + getId() + ", Tipo: " + getTipo() + ", Nome do serviço: " + getNome() + ", Descrição: " + getDescricao();
	}
	
	
	
	
	
	
	

}
