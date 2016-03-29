package br.com.equipejr.managebean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SimpleSubmit {
	
	private String justification;

	public void save() {
		System.out.println("Teste!");
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}
}
