package models;

import java.sql.Date;

public class Atracao {
	
	int id;
	int idadeMinima;
	int alturaMinima;
	int valor;
	String nome;
	String descricao;
	String restricao;
	CategoriaAtracao CategoriaAtracao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public int getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(int alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
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
	public String getRestricao() {
		return restricao;
	}
	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}
	public CategoriaAtracao getCategoriaAtracao() {
		return CategoriaAtracao;
	}
	public void setCategoriaAtracao(CategoriaAtracao categoriaAtracao) {
		CategoriaAtracao = categoriaAtracao;
	}
	
}
