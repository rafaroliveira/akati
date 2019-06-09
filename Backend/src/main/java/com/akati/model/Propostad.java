package com.akati.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Propostad {
	
	@JsonProperty("cpf")
	String cpf;
	@JsonProperty("valorCompra")
	int valorCompra;
	@JsonProperty("parcelas")
	int parcelas;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
}
