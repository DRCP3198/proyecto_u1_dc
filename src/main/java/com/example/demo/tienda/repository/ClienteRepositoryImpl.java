package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl  implements IClienteRepository{

	
	//Para simular la conexion de la base de  datos vamos a creaqr una lista
	//del objeto que estamos utilizando
	
	private static List<Cliente> baseDeDatos = new ArrayList<>();
	
	@Override
	public void insert(Cliente cliente) {
		// TODO Auto-generated method stub
		baseDeDatos.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		
		// TODO Auto-generated method stub
		Cliente cli= null;

		for (Cliente  c : baseDeDatos) {//la lista que es mi base de datos
			if (c.getCedula().equals(cliente.getCedula())) { //Si es igual al numero de cuenta hace la comparacion
				cli=c;
				//break;
		
		}	
		baseDeDatos.remove(cli);
		baseDeDatos.add(cliente);
		}
	}
	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		
		Cliente cli= null;
		for(Cliente c : baseDeDatos) {
			if(c.getCedula().equals(cedula)) {
			cli=c;	
			}
		}
		return cli;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		//Me falta el borrar
		Cliente cli=this.buscar(cedula);
		baseDeDatos.remove(cli);
		
		
	}

}
