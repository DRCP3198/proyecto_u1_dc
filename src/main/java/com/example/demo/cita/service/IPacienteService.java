package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteService {
	
	
	public Paciente buscar(String cedula);
	public void crear(Paciente paciente);
	public void borrar(String cedula);
	public void modificar(Paciente paciente);
	public void modificar(String cedula,String tipo);

}
