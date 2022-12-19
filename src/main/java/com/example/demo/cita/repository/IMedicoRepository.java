package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Medico;

public interface IMedicoRepository {
	
	public Medico buscar(String cedula);
	public void insertar( Medico medico);
	public void borrar(String cedula);
	

}
