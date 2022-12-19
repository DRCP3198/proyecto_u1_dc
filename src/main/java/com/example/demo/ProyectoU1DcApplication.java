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
import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Medico;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.service.ICitaMedicaService;
import com.example.demo.cita.service.IMedicoService;
import com.example.demo.cita.service.IPacienteService;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;
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
    
	//CUENTA BANCARIAS
	/*@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Qualifier("grande")
	@Autowired
	private ITransferenciaService iTransferenciaService;
	*/
	
	//EJERCICIO 1
	/*@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	*/
	
	@Autowired
	private ICitaMedicaService iCitaMedicaService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired 
	private IMedicoService iMedicoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
		Paciente p = new Paciente();
		p.setCedula("1725247665");
		p.setNombre("Israel C");
		p.setTipo("A");
		this.iPacienteService.crear(p);
		p.setCedula("1725247645");
		this.iPacienteService.modificar(p);
		
		Medico med = new Medico();
		med.setCedula("1751457167");
		med.setNombre("Jose Pozo");
		this.iMedicoService.guardar(med);
		
		this.iCitaMedicaService.crearCita("1725247645", "A");
		
		
		/*//Opcion 1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyta");
		vehi.setPlaca("PDF12654");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		this.iVehiculoService.crear(vehi);
		//Es una opcion
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		this.iVehiculoService.modificar(vehi);
		
		//Opcion 2
		
		
		Propietario propietario = new Propietario();
		propietario.setApellido("Colon");
		propietario.setCedula("154774566");
		propietario.setFechaNacimiento(LocalDateTime.of(1978, 8,31,12,35));
		propietario.setNombre("Edison");
		 this.iPropietarioService.guardar(propietario);
		
		//Opcion 3
		 this.iMatriculaService.matricular("15774566", "PDF12654");*/
		
		
		
		
		/*CuentaBancaria cuenta1 = new CuentaBancaria();
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
		}*/
		
		
	}

}
