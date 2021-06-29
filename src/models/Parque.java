package models;

public class Parque extends Nome {

	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | CNPJ: " + getCnpj();
	}
	
	
}
