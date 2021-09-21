package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	private String nombres;
	private String apaterno;
	private String amaterno;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimiento;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	private DateTimeFormat fechaRegistro;
	
	private String email;
	
	@JoinColumn(name = "estado")
	
	private int celular;
	private String direccion;
	private String login;
	private String password;
	private int dni;
	private int idTipoUsuario;
	private int idUbigeo;

}
