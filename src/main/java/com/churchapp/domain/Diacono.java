package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Diacono implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoDiacono;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFim;
	
	public Diacono() {
		
	}

	public Diacono(Integer codigoDiacono, Date dataInicio, Date dataFim) {
		super();
		this.codigoDiacono = codigoDiacono;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Integer getCodigoDiacono() {
		return codigoDiacono;
	}

	public void setCodigoDiacono(Integer codigoDiacono) {
		this.codigoDiacono = codigoDiacono;
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
		result = prime * result + ((codigoDiacono == null) ? 0 : codigoDiacono.hashCode());
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
		Diacono other = (Diacono) obj;
		if (codigoDiacono == null) {
			if (other.codigoDiacono != null)
				return false;
		} else if (!codigoDiacono.equals(other.codigoDiacono))
			return false;
		return true;
	}

}
