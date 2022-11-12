package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class CitaMedica {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	private String ced_medico;

	public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico, String cedMedico,
			String nombrePaciente, String cedulaPaciente) {

		this.numero=numero;
		this.fechaCita=fechaCita;
		
		Medico med = new Medico();
		medico.setCedula(ced_medico);
		medico.setNombre(nombreMedico);
		
		this.medico= med;
		
		
		Paciente pac = new Paciente();
		paciente.setCedula(cedulaPaciente);
		paciente.setNombre(nombrePaciente);
		
		this.paciente = pac;
	}

	// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
