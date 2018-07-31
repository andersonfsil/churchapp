package com.churchapp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoEmpresa;
	private String nomeEmpresa;
	private String visaoEmpresa;
	private String missaoEmpresa;
	
	public Empresa() {
		
	}

	public Empresa(Integer codigoEmpresa, String nomeEmpresa, String visaoEmpresa, String missaoEmpresa) {
		super();
		this.codigoEmpresa = codigoEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.visaoEmpresa = visaoEmpresa;
		this.missaoEmpresa = missaoEmpresa;
	}

	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getVisaoEmpresa() {
		return visaoEmpresa;
	}

	public void setVisaoEmpresa(String visaoEmpresa) {
		this.visaoEmpresa = visaoEmpresa;
	}

	public String getMissaoEmpresa() {
		return missaoEmpresa;
	}

	public void setMissaoEmpresa(String missaoEmpresa) {
		this.missaoEmpresa = missaoEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoEmpresa == null) ? 0 : codigoEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (codigoEmpresa == null) {
			if (other.codigoEmpresa != null)
				return false;
		} else if (!codigoEmpresa.equals(other.codigoEmpresa))
			return false;
		return true;
	}
	
	

}
