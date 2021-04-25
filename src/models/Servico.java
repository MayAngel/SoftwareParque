package models;

//import java.sql.Date;

public class Servico {
	
	private int id;
	private String tipo;
	private String nome;
	private String descricao;
	private Parque parque;
	
	
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
		
	public Parque getParque() {
		return parque;
	}
	public void setParque(Parque parque) {
		this.parque = parque;
	}
	@Override
	public String toString() {
		return "ID:" + getId() + ", Tipo: " + getTipo() + ", Nome do serviço: " + getNome() + ", Descrição: " + getDescricao();
	}
	
	
	
	
	
	
	

}
