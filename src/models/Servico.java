package models;
import java.util.Date;

public class Servico {
	
	public Servico() {
		this.criadoEm = new Date();
	}
	
	private int id;
	private String tipo;
	private String nome;
	private String descricao;
	private Date criadoEm;
	
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
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "Id: " + id + " | Nome: " + nome + " | Tipo: " + tipo + " | Descrição: " + descricao + " | Criado em: " + criadoEm;
	}
}
