package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PacienteH te = new PacienteTerceraEdadH();
		te.setCedula("12154415345");
		te.setNombre("Daniel");
		//te.setCodigoIESS("223132132");
		te.setTipo("TE");*/
		
		PacienteH ninio = new PacienteNinioH();
		ninio.setCedula("12154415345");
		ninio.setPesoNacimiento(8);
		ninio.setNombre("Daniel");
		//te.setCodigoIESS("223132132");
		ninio.setTipo("N");
		
		PacienteCancerH pacienteC = new PacienteCancerH();
		pacienteC.setCedula("125445");
		pacienteC.setNombre("Daniel");
		pacienteC.setTipo("C");
		
		MedicoH mh = new MedicoH();
		mh.setCedula("1231332");
		mh.setNombre("Amdres");
		
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar("123123", LocalDateTime.of(2022, 12,2,8,30), pacienteC, mh);
	}

}

