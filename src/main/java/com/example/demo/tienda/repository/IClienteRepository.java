package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {

	
	public void insert(Cliente cliente);
	public void actualizar(Cliente cliente);
	//Estos dos siempre deben ser por un identificador guiados
	public Cliente buscar(String cedula);
	
	public void eliminar(String cedula);
	
}
