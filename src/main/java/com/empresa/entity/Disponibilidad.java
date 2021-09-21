package com.empresa.entity;


import java.time.LocalTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "disponibilidad")
@Getter
@Setter
public class Disponibilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisponibilidad;
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime horaInicio;
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime horaFin;
	private String dia;
	
	@ManyToOne
	@JoinColumn(name = "idCiclo")
	private Ciclo ciclo;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	
	

}
