package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.PacienteCancerH;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

//Dillan Coloma
//Taller4

//Es la que me va a permitir la ejecucion por consola

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {
    
	
	@Autowired
	private PacienteTerceraEdadSB pacientTE;
	
	@Autowired
	private CitaMedicaSB cita;
	
	@Autowired
	private MedicoSB medico;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		System.out.println(pacientTE);
		this.pacientTE.setCodigoIESS("15s57dwe52wds4");
		this.pacientTE.setNombre("Edison");
		this.pacientTE.setTipo("T");
		this.pacientTE.setCedula("15458742512");
		
		System.out.println(pacientTE);
		cita.agendar("123123", LocalDateTime.of(2022,12 ,2,8,30), pacientTE, medico);
		
	}

}
