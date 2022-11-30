package com.example.demo.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
	
	//uso el String ya que cuando un dato no es sujeto
	// de operaciones matematicas no tiene sentido usar Integer
	private String numero;
	private String tipo;
	private BigDecimal saldo;  //Cuando se vaya a usar valores monetarios se debe usar
    private String titular;    //el BigDecimal	
	
    
    
    @Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular
				+ "]";
	}
	//Metodos set y  get
    public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

    
    
    
	
	

}
