package models;
import java.util.Date;

public class Ingresso {
	
	public Ingresso() {
		this.criadoEm = new Date();
	}
	
	private int id;
	private int QRCode;
	private char dataCompra;
	private float valorIngresso;
	private Visitante visitante;
	private Atracao listaAtracao;
	private Parque parque; 
	private Date criadoEm;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQRCode() {
		return QRCode;
	}
	public void setQRCode(int qRCode) {
		QRCode = qRCode;
	}
	public char getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(char dataCompra) {
		this.dataCompra = dataCompra;
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
	public Atracao getListaAtracao() {
		return listaAtracao;
	}
	public void setListaAtracao(Atracao listaAtracao) {
		this.listaAtracao = listaAtracao;
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
		return "Id: " + id + " | QR : " + QRCode + " | Data da Compra: " + dataCompra + " | Valor do Ingresso: " + valorIngresso +
			   " | Visitante: " + visitante + " | Lista de Atrações:" + listaAtracao + " | Parque: " + parque + "| Criado em: " + criadoEm;
	}
}
