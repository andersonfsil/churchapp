package com.churchapp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoContato;
	private String tipoContato;
	private Integer numero;
	private String email;
	private Integer ddd;
	
	public Contato() {
		
	}

	public Contato(Integer codigoContato, String tipoContato, Integer numero, String email, Integer ddd) {
		super();
		this.codigoContato = codigoContato;
		this.tipoContato = tipoContato;
		this.numero = numero;
		this.email = email;
		this.ddd = ddd;
	}

	public Integer getCodigoContato() {
		return codigoContato;
	}

	public void setCodigoContato(Integer codigoContato) {
		this.codigoContato = codigoContato;
	}

	public String getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoContato == null) ? 0 : codigoContato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (codigoContato == null) {
			if (other.codigoContato != null)
				return false;
		} else if (!codigoContato.equals(other.codigoContato))
			return false;
		return true;
	}
	
}
