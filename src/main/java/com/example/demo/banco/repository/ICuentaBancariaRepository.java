package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
    
	//Metodo que me busque por numero de cuenta en la base de datos
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	//CRUD siempre vamos a contruir el crud
	public CuentaBancaria buscar(Integer id); //me busque por identificacion
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
}
