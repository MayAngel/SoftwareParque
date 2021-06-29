package models;

public class Atracao extends Restricoes {

	private double alturaMinima;
	private double idadeMin;
	private double valor;
	private CategoriaAtracao CategoriaAtracao;

	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public double getIdadeMin() {
		return idadeMin;
	}
	public void setIdadeMin(double idadeMin) {
		this.idadeMin = idadeMin;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public CategoriaAtracao getCategoriaAtracao() {
		return CategoriaAtracao;
	}
	public void setCategoriaAtracao(CategoriaAtracao categoriaAtracao) {
		CategoriaAtracao = categoriaAtracao;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Altura M�nima: " + getAlturaMinima() + " | Idade M�nima: " + getIdadeMin() + " | Valor R$: " + getValor();
	}
	
}
