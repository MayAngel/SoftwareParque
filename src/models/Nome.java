package models;

public abstract class Nome extends Origin {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() { 
		return super.toString() + " | Nome: " + getNome();
	}

}
