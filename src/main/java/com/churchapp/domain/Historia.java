package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Historia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoHistoria;
	private String textoHistoria;
	private String tituloHistoria;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFim;
	
	public Historia() {
		
	}

	public Historia(Integer codigoHistoria, String textoHistoria, String tituloHistoria, Date dataInicio,
			Date dataFim) {
		super();
		this.codigoHistoria = codigoHistoria;
		this.textoHistoria = textoHistoria;
		this.tituloHistoria = tituloHistoria;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Integer getCodigoHistoria() {
		return codigoHistoria;
	}

	public void setCodigoHistoria(Integer codigoHistoria) {
		this.codigoHistoria = codigoHistoria;
	}

	public String getTextoHistoria() {
		return textoHistoria;
	}

	public void setTextoHistoria(String textoHistoria) {
		this.textoHistoria = textoHistoria;
	}

	public String getTituloHistoria() {
		return tituloHistoria;
	}

	public void setTituloHistoria(String tituloHistoria) {
		this.tituloHistoria = tituloHistoria;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoHistoria == null) ? 0 : codigoHistoria.hashCode());
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
		Historia other = (Historia) obj;
		if (codigoHistoria == null) {
			if (other.codigoHistoria != null)
				return false;
		} else if (!codigoHistoria.equals(other.codigoHistoria))
			return false;
		return true;
	}
	
	
}
