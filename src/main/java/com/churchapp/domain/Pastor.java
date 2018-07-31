package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pastor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoPastor;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicioPastoral;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFimPastoral;
	
	public Pastor() {
		
	}

	public Pastor(Integer codigoPastor, Date dataInicioPastoral, Date dataFimPastoral) {
		super();
		this.codigoPastor = codigoPastor;
		this.dataInicioPastoral = dataInicioPastoral;
		this.dataFimPastoral = dataFimPastoral;
	}

	public Integer getCodigoPastor() {
		return codigoPastor;
	}

	public void setCodigoPastor(Integer codigoPastor) {
		this.codigoPastor = codigoPastor;
	}

	public Date getDataInicioPastoral() {
		return dataInicioPastoral;
	}

	public void setDataInicioPastoral(Date dataInicioPastoral) {
		this.dataInicioPastoral = dataInicioPastoral;
	}

	public Date getDataFimPastoral() {
		return dataFimPastoral;
	}

	public void setDataFimPastoral(Date dataFimPastoral) {
		this.dataFimPastoral = dataFimPastoral;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoPastor == null) ? 0 : codigoPastor.hashCode());
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
		Pastor other = (Pastor) obj;
		if (codigoPastor == null) {
			if (other.codigoPastor != null)
				return false;
		} else if (!codigoPastor.equals(other.codigoPastor))
			return false;
		return true;
	}
	
	
}
