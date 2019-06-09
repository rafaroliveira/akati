package com.akati.controller;

import org.springframework.stereotype.Service;

@Service
public class ProcessaAnalise {

	/*
	 * Regras para decisao de credito
	 * 1 - Valor da compra tem que ser menor que o limite de credito disponivel
	 * 2 - O salario tem que ser maior do que 3X o valor da parcela
	 * 3 - Caso possua mais de 7 anos de emprego o valor do salario pode ser 2x o valor da parcela
	 */
	public Boolean analisa(Double salario, int profissao, int limiteCredito, int valorCompra, int parcelas){
		if(valorCompra > limiteCredito) return false;
		if(salario < ((valorCompra/parcelas)*3)) return false;
		if(salario >= ((valorCompra/parcelas)*3) ||
				(profissao >= 7 && salario < ((valorCompra/parcelas)*2))) return true;
		return false;
	}
}
