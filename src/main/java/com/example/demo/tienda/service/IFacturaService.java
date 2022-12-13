package com.example.demo.tienda.service;

import java.util.List;

import com.example.demo.tienda.modelo.ItemTO;

public interface IFacturaService {

	//CRUD
	//Se usa siempre estilos mas comunes al nombrar
	//Tipo nombre del negocio
	public void generar(String cedulaCliente,List<ItemTO> detalles);//Le genero con cedula de cliente
	
	
}
