package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;
@Service("grande")
public class TransferenciaServiceImpl implements ITransferenciaService{
	
	
	@Autowired
	private ITransferenciaRepository transferencia;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.transferencia.buscarTodo();
	}

	@Override
	public void realizar(String numOrigen, String numDestino, BigDecimal monto) {
		//ORIGEN
		//paso 1: buscar la cuenta Origen
		CuentaBancaria bancariaOrigen = this.bancariaService.buscarPorNumero(numOrigen);
		//paso 2: Consultar el saldo
		BigDecimal SaldoOrigen =  bancariaOrigen.getSaldo();
		//paso 3: operacion (operacion resta origen)

		BigDecimal nuevoSaldo = SaldoOrigen.subtract(monto);
		//paso 4: actualizar cuenta origen
		bancariaOrigen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(bancariaOrigen);
		
		
		//DESTINO
		//paso 1: buscar la cuenta Destino
		CuentaBancaria bancariaDestino = this.bancariaService.buscarPorNumero(numDestino);
		//paso 2: Consultar el saldo
		BigDecimal SaldoDestino =  bancariaDestino.getSaldo();
		//paso 3: operacion (operacion suma origen)
		//paso 4: actualizar cuenta Destino
	
		
		BigDecimal nuevoSaldoD = SaldoDestino.add(monto);
		bancariaDestino.setSaldo(nuevoSaldoD);
		this.bancariaService.actualizar(bancariaDestino);
		
		Transferencia trans = new Transferencia();
		trans.setCuentaDestino(numDestino);
		trans.setCuentaOrigen(numOrigen);
		trans.setFecha(LocalDateTime.now());
		trans.setMonto(monto);
		trans.setNumero("12565656");
		this.transferencia.insertar(trans);
		
	}
	
	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.transferencia.borrar(id);
	}

	@Override
	public void actualizar(Transferencia transferenciaT) {
		// TODO Auto-generated method stub
		this.transferencia.actualizar(transferenciaT);
	}

	@Override
	public void insertar(Transferencia transferenciaT) {
		// TODO Auto-generated method stub
		this.transferencia.insertar(transferenciaT);
		
	}


}
