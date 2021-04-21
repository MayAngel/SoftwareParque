package models;
import java.util.Date;

public class CategoriaAtracao {
	
	public CategoriaAtracao() {
		this.criadoEm = new Date();
	}
	
	private int id;
	private int idadeMinima;
	private String nome;
	private String descricao;
	private String restricao;
	private Parque parque;
	private Date criadoEm;
	
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
	public Parque getParque() {
		return parque;
	}
	public void setParque(Parque parque) {
		this.parque = parque;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " | Nome: " + nome + " | Idade Mínima: " + idadeMinima + " | Descrição: " + descricao + 
			   " | Restrições: " + restricao + " | Parque: " + parque + " | Criado em: " + criadoEm;
	}

}
