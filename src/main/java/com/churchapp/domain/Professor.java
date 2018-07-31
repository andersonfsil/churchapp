package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoProfessor;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFim;
	
	public Professor() {
		
	}

	public Professor(Integer codigoProfessor, Date dataInicio, Date dataFim) {
		super();
		this.codigoProfessor = codigoProfessor;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProfessor == null) ? 0 : codigoProfessor.hashCode());
		return result;
	}

	public Integer getCodigoProfessor() {
		return codigoProfessor;
	}

	public void setCodigoProfessor(Integer codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (codigoProfessor == null) {
			if (other.codigoProfessor != null)
				return false;
		} else if (!codigoProfessor.equals(other.codigoProfessor))
			return false;
		return true;
	}
	
	

}
