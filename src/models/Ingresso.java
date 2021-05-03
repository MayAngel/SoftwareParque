package models;
import java.util.ArrayList;
import java.util.Date;

public class Ingresso {
	
	public Ingresso() {
		this.criadoEm = new Date();
	}
	
	private int QRCode;
	private float valorIngresso;
	private Visitante visitante;
	private ArrayList<Atracao> atracoes;
	private Parque parque;
	private Date criadoEm;
	
	public int getQRCode() {
		return QRCode;
	}
	public void setQRCode(int qRCode) {
		QRCode = qRCode;
	}
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
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return " | QR : " + getQRCode() + " | Valor do Ingresso: R$" + getValorIngresso() + " | Visitante: " + getVisitante() + 
			   " | Lista de Atrações:" + getAtracoes() + " | Parque: " + getParque() + "| Criado em: " + getCriadoEm();
	}
}
