package com.example.demo.banco.service;


import com.example.demo.banco.modelo.CuentaBancaria;


public interface ICuentaBancariaService {
	
	//Metodo que me busque por numero de cuenta en la base de datos
		public CuentaBancaria buscarPorNumero(String numeroCuenta);
		
		//CRUD
		public CuentaBancaria buscar(Integer id); //me busque por identificacion
		public void actualizar(CuentaBancaria cuentaBancaria);
		public void insertar(CuentaBancaria cuentaBancaria);
		public void borrar(Integer id);


}
