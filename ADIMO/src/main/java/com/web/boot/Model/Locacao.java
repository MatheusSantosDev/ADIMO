package com.web.boot.Model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "locacao")
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "imovel_id")
	private Imovel imovel;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ficha_cliente_id")
	private FichaCliente ficha;
	
	@NotNull
	private LocalDateTime data_inicial;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public FichaCliente getFicha() {
		return ficha;
	}

	public void setFicha(FichaCliente ficha) {
		this.ficha = ficha;
	}

	public LocalDateTime getData_inicial() {
		return data_inicial;
	}

	public void setData_inicial(LocalDateTime data_inicial) {
		this.data_inicial = data_inicial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Locacao other = (Locacao) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
