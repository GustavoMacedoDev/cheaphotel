package br.com.macedo.sistemas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel implements Serializable{

	private static final long serialVersionUID = 7158844253864365542L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHotel;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "telefone", nullable = false)
	private String telefone;
	@Column(name = "horario_checkin", nullable = false)
	private String horarioCheckin;
	@Column(name = "horario_checkout", nullable = false)
	private String horarioCheckout;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getHorarioCheckin() {
		return horarioCheckin;
	}

	public void setHorarioCheckin(String horarioCheckin) {
		this.horarioCheckin = horarioCheckin;
	}

	public String getHorarioCheckout() {
		return horarioCheckout;
	}

	public void setHorarioCheckout(String horarioCheckout) {
		this.horarioCheckout = horarioCheckout;
	}
	
	
	
}
