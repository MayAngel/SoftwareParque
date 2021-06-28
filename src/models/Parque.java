package models;

public class Parque extends Endereços {

	private String cnpj;
	private String site;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | CNPJ: " + getCnpj() + " | Site: " + getSite();
	}
	
	
}
