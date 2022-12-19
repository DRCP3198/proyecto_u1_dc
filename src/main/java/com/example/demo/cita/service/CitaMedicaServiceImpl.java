package com.example.demo.cita.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.ICitaMedicaRepository;
import com.example.demo.cita.repository.IMedicoRepository;
import com.example.demo.cita.repository.IPacienteRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	
	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Autowired
	private IMedicoRepository iMedicoRepository;
	
	@Override
	public void crearCita(String cedula, String tipo) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica= new CitaMedica();
		citaMedica.setFechaAgenda(LocalDateTime.now());
		Paciente pac = this.iPacienteRepository.buscar(cedula);
		citaMedica.setPaciente(pac);
        
		Medico med = this.iMedicoRepository.buscar(cedula);
		citaMedica.setMedico(med);
		
		//PARA EL TIPO DE CITA
		BigDecimal valor= null;
		if(pac.getTipo().equals("A")) {
			System.out.println("Obtiene descuento del 12% en al cita");	
		   
		}
		else {
			System.out.println("Sin descuento");
		}
		this.iCitaMedicaRepository.insertar(citaMedica);
		
	}

}
