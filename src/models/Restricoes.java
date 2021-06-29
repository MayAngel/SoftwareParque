package models;

public abstract class Restricoes extends Nome {
	
	private String restricao;
	private String descricao;
	
	public String getRestricao() {
		return restricao;
	}
	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Restrição: " + getRestricao() + " | Descrição: " + getDescricao();
	}

}
