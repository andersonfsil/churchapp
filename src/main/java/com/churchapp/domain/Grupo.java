package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoGrupo;
	private String nomeGrupo;
	private Integer idadeGrupo;
	private String turnoGrupo;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataCriacao;
	
	public Grupo() {
		
	}

	public Grupo(Integer codigoGrupo, String nomeGrupo, Integer idadeGrupo, String turnoGrupo, Date dataCriacao) {
		super();
		this.codigoGrupo = codigoGrupo;
		this.nomeGrupo = nomeGrupo;
		this.idadeGrupo = idadeGrupo;
		this.turnoGrupo = turnoGrupo;
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoGrupo == null) ? 0 : codigoGrupo.hashCode());
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
		Grupo other = (Grupo) obj;
		if (codigoGrupo == null) {
			if (other.codigoGrupo != null)
				return false;
		} else if (!codigoGrupo.equals(other.codigoGrupo))
			return false;
		return true;
	}

	public Integer getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(Integer codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	public Integer getIdadeGrupo() {
		return idadeGrupo;
	}

	public void setIdadeGrupo(Integer idadeGrupo) {
		this.idadeGrupo = idadeGrupo;
	}

	public String getTurnoGrupo() {
		return turnoGrupo;
	}

	public void setTurnoGrupo(String turnoGrupo) {
		this.turnoGrupo = turnoGrupo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
}
