package br.com.SisPedidos.dto;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String senha;
	
	public CredenciaisDTO() {
	}
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
