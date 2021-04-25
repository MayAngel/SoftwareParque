package models;
import java.util.Date;

public class Atracao {
	
	public Atracao() {
		this.criadoEm = new Date();
	}
	
	private int id;
	private int idadeMinima;
	private double alturaMinima;
	private double valor;
	private String nome;
	private String descricao;
	private String restricao;
	private CategoriaAtracao CategoriaAtracao;
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
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
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
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Id: " + getId() + "Nome: " + getNome() + " | Idade Mínima: " + getIdadeMinima() + " | Altura Mínima" + getAlturaMinima() + 
		       " | Valor: R$" + getValor() + "| Descrição: " + getDescricao() + " | Restrições: " + getRestricao() + 
		       " | Categoria da Atração: " + getCategoriaAtracao() + " | Criado em: " + getCriadoEm();
	}
	
}
