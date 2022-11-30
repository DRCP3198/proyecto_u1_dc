package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;
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
	private ICuentaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("1255485");
		cuenta1.setTipo("A");
		cuenta1.setTitular("Dillan Coloma");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("125548522s");
		cuenta2.setTipo("A");
		cuenta2.setTitular("Israel Coloma");
		cuenta2.setSaldo(new BigDecimal(200));
		this.bancariaService.insertar(cuenta2);
	
		
	}

}
