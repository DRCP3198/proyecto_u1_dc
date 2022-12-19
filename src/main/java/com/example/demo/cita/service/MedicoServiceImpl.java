package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl  implements IMedicoService{

	@Autowired
	private IMedicoRepository iMedicoRepository;
	
	@Override
	public void guardar(Medico medico) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.insertar(medico);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iMedicoRepository.borrar(cedula);
	}

}
