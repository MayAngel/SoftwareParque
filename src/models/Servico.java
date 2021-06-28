package models;

public class Servico extends Descricao {
	
	private String tipo;
	private Parque parque;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}		
	public Parque getParque() {
		return parque;
	}
	public void setParque(Parque parque) {
		this.parque = parque;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Tipo: " + getTipo();
	}
	
	
	
	
	
	
	

}
