package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Medico;

@Repository
public class MedicoRepoImpl implements IMedicoRepository {

	private static List<Medico> base = new ArrayList<>();
	
	@Override
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		Medico medico = null;
		for(Medico m : base) {
			if(m.getCedula().equals(cedula)) {
				medico= m;
			}
		}
		return medico;
	}

	@Override
	public void insertar(Medico medico) {
		// TODO Auto-generated method stub
		base.add(medico);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
	}

}
