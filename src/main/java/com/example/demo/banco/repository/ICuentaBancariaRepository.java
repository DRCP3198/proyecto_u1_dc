package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	// estos son los que necesitamos ahora
	public CuentaBancaria buscarPorNumero(String numCuenta);
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	
	//CRUD: siempre hasta tener experiencia
	
	public CuentaBancaria buscar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
}
