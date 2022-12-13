package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
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
	
	@Qualifier("grande")
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
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
		cuenta1.setSaldo(new BigDecimal(150));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("125548522s");
		cuenta2.setTipo("C");
		cuenta2.setTitular("Israel Coloma");
		cuenta2.setSaldo(new BigDecimal(200));
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("Saldos Actuales: ");
		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("1255485");
		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("125548522s");
		
		System.out.println("saldo actual: " + cuentaActual1.getSaldo());
		System.out.println("saldo actual: " + cuentaActual2.getSaldo());
		
		System.out.println("REPORTE 1");
		for(Transferencia t:this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		this.iTransferenciaService.realizar("1255485", "125548522s", new BigDecimal(30));
		
		System.out.println("REPORTE 2");
		for(Transferencia t:this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		
	}

}
