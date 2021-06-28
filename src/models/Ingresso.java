package models;
import java.util.ArrayList;

public class Ingresso extends Origin {
	
	private float valorIngresso;
	private Visitante visitante;
	private ArrayList<Atracao> atracoes;
	private Parque parque;
	
	
	public float getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(float valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	public Visitante getVisitante() {
		return visitante;
	}
	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
	
	public ArrayList<Atracao> getAtracoes() {
		return atracoes;
	}
	public void setAtracoes(ArrayList<Atracao> atracoes) {
		this.atracoes = atracoes;
	}
	public Parque getParque() {
		return parque;
	}
	public void setParque(Parque parque) {
		this.parque = parque;
	}
	

	@Override
	public String toString() {
		return super.toString() + " | Valor do Ingresso: R$" + getValorIngresso() + " | Visitante: " + getVisitante() + 
			   " | Lista de Atrações:" + getAtracoes() + " | Parque: " + getParque();
	}
}
