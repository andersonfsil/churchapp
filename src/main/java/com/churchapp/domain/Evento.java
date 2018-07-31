package com.churchapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoEvento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicioEvento;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFimEvento;
	private String tituloEvento;
	private String localEvento;
	private String turnoEvento;
	private String obsEvento;
	private String temaEvento;
	private String divisaEvento;
	
	public Evento() {
		
	}

	public Evento(Integer codigoEvento, Date dataInicioEvento, Date dataFimEvento, String tituloEvento,
			String localEvento, String turnoEvento, String obsEvento, String temaEvento, String divisaEvento) {
		super();
		this.codigoEvento = codigoEvento;
		this.dataInicioEvento = dataInicioEvento;
		this.dataFimEvento = dataFimEvento;
		this.tituloEvento = tituloEvento;
		this.localEvento = localEvento;
		this.turnoEvento = turnoEvento;
		this.obsEvento = obsEvento;
		this.temaEvento = temaEvento;
		this.divisaEvento = divisaEvento;
	}

	public Integer getCodigoEvento() {
		return codigoEvento;
	}

	public void setCodigoEvento(Integer codigoEvento) {
		this.codigoEvento = codigoEvento;
	}

	public Date getDataInicioEvento() {
		return dataInicioEvento;
	}

	public void setDataInicioEvento(Date dataInicioEvento) {
		this.dataInicioEvento = dataInicioEvento;
	}

	public Date getDataFimEvento() {
		return dataFimEvento;
	}

	public void setDataFimEvento(Date dataFimEvento) {
		this.dataFimEvento = dataFimEvento;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public String getTurnoEvento() {
		return turnoEvento;
	}

	public void setTurnoEvento(String turnoEvento) {
		this.turnoEvento = turnoEvento;
	}

	public String getObsEvento() {
		return obsEvento;
	}

	public void setObsEvento(String obsEvento) {
		this.obsEvento = obsEvento;
	}

	public String getTemaEvento() {
		return temaEvento;
	}

	public void setTemaEvento(String temaEvento) {
		this.temaEvento = temaEvento;
	}

	public String getDivisaEvento() {
		return divisaEvento;
	}

	public void setDivisaEvento(String divisaEvento) {
		this.divisaEvento = divisaEvento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoEvento == null) ? 0 : codigoEvento.hashCode());
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
		Evento other = (Evento) obj;
		if (codigoEvento == null) {
			if (other.codigoEvento != null)
				return false;
		} else if (!codigoEvento.equals(other.codigoEvento))
			return false;
		return true;
	}
	
	
}
