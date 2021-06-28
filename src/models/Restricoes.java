package models;

public abstract class Restricoes extends Descricao{
	
	private int idadeMin;
	private String restricao;
	
	public int getIdadeMin() {
		return idadeMin;
	}
	public void setIdadeMin(int idadeMin) {
		this.idadeMin = idadeMin;
	}
	public String getRestricao() {
		return restricao;
	}
	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Idade Mínima: " + getIdadeMin() + " | Restrição: " + getRestricao();
	}

}
