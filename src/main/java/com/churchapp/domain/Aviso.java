package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Aviso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoAviso;
	private String textoEvento;
	private String imagemEvento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicioAviso;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFimAviso;
	private String temaAviso;
	private String divisaAviso;
	
	public Aviso() {
		
	}

	public Aviso(Integer codigoAviso, String textoEvento, String imagemEvento, Date dataInicioAviso, Date dataFimAviso,
			String temaAviso, String divisaAviso) {
		super();
		this.codigoAviso = codigoAviso;
		this.textoEvento = textoEvento;
		this.imagemEvento = imagemEvento;
		this.dataInicioAviso = dataInicioAviso;
		this.dataFimAviso = dataFimAviso;
		this.temaAviso = temaAviso;
		this.divisaAviso = divisaAviso;
	}

	public Integer getCodigoAviso() {
		return codigoAviso;
	}

	public void setCodigoAviso(Integer codigoAviso) {
		this.codigoAviso = codigoAviso;
	}

	public String getTextoEvento() {
		return textoEvento;
	}

	public void setTextoEvento(String textoEvento) {
		this.textoEvento = textoEvento;
	}

	public String getImagemEvento() {
		return imagemEvento;
	}

	public void setImagemEvento(String imagemEvento) {
		this.imagemEvento = imagemEvento;
	}

	public Date getDataInicioAviso() {
		return dataInicioAviso;
	}

	public void setDataInicioAviso(Date dataInicioAviso) {
		this.dataInicioAviso = dataInicioAviso;
	}

	public Date getDataFimAviso() {
		return dataFimAviso;
	}

	public void setDataFimAviso(Date dataFimAviso) {
		this.dataFimAviso = dataFimAviso;
	}

	public String getTemaAviso() {
		return temaAviso;
	}

	public void setTemaAviso(String temaAviso) {
		this.temaAviso = temaAviso;
	}

	public String getDivisaAviso() {
		return divisaAviso;
	}

	public void setDivisaAviso(String divisaAviso) {
		this.divisaAviso = divisaAviso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAviso == null) ? 0 : codigoAviso.hashCode());
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
		Aviso other = (Aviso) obj;
		if (codigoAviso == null) {
			if (other.codigoAviso != null)
				return false;
		} else if (!codigoAviso.equals(other.codigoAviso))
			return false;
		return true;
	}
	
	
}
