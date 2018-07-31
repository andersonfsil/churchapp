package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Culto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoCulto;
	private String turnoCulto;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataCulto;
	private String localCulto;
	private String obsCulto;
	private String tituloCulto;
	private String dirigente;
	
	public Culto() {
		
	}

	public Culto(Integer codigoCulto, String turnoCulto, Date dataCulto, String localCulto, String obsCulto,
			String tituloCulto, String dirigente) {
		super();
		this.codigoCulto = codigoCulto;
		this.turnoCulto = turnoCulto;
		this.dataCulto = dataCulto;
		this.localCulto = localCulto;
		this.obsCulto = obsCulto;
		this.tituloCulto = tituloCulto;
		this.dirigente = dirigente;
	}

	public Integer getCodigoCulto() {
		return codigoCulto;
	}

	public void setCodigoCulto(Integer codigoCulto) {
		this.codigoCulto = codigoCulto;
	}

	public String getTurnoCulto() {
		return turnoCulto;
	}

	public void setTurnoCulto(String turnoCulto) {
		this.turnoCulto = turnoCulto;
	}

	public Date getDataCulto() {
		return dataCulto;
	}

	public void setDataCulto(Date dataCulto) {
		this.dataCulto = dataCulto;
	}

	public String getLocalCulto() {
		return localCulto;
	}

	public void setLocalCulto(String localCulto) {
		this.localCulto = localCulto;
	}

	public String getObsCulto() {
		return obsCulto;
	}

	public void setObsCulto(String obsCulto) {
		this.obsCulto = obsCulto;
	}

	public String getTituloCulto() {
		return tituloCulto;
	}

	public void setTituloCulto(String tituloCulto) {
		this.tituloCulto = tituloCulto;
	}

	public String getDirigente() {
		return dirigente;
	}

	public void setDirigente(String dirigente) {
		this.dirigente = dirigente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCulto == null) ? 0 : codigoCulto.hashCode());
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
		Culto other = (Culto) obj;
		if (codigoCulto == null) {
			if (other.codigoCulto != null)
				return false;
		} else if (!codigoCulto.equals(other.codigoCulto))
			return false;
		return true;
	}
	
	
}
