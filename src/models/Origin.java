package models;

import java.util.Date;

public abstract class Origin {
	
	public Origin() {
		setCriadoEm(new Date());
	}
	
	private int id;
	private Date criadoEm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Criado em: " + getCriadoEm() + " | Id: " + getId();
	}

}
