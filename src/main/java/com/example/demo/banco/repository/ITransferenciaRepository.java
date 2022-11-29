package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	
	//CRUD siempre vamos a contruir el crud
		public Transferencia buscar(Integer id); //me busque por identificacion
		//
		public void actualizar(Transferencia transferencia);
		public void insertar(Transferencia transferencia);
		public void borrar(Integer id);
}
