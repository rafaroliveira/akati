package com.akati.controller;

public class AkatiConstants {

	public static String ENDPOINT_CONDUCTOR = "https://ciabhackathon.conductor.com.br:8443";
	
	public static String KMEANS_EXAMPLE = "{\n" + 
			"    \"columns\": [\n" + 
			"        \"cartao\",\n" + 
			"        \"cep\",\n" + 
			"        \"codigoMoedaDestino\",\n" + 
			"        \"codigoMoedaOrigem\",\n" + 
			"        \"cpf\",\n" + 
			"        \"dataCompra\",\n" + 
			"        \"dataEmissao\",\n" + 
			"        \"dataNascimento\",\n" + 
			"        \"dataValidade\",\n" + 
			"        \"empresa\",\n" + 
			"        \"estadoCivil\",\n" + 
			"        \"idConta\",\n" + 
			"        \"idEstabelecimento\",\n" + 
			"        \"idEventoCompra\",\n" + 
			"        \"idOperacao\",\n" + 
			"        \"latitude\",\n" + 
			"        \"limiteCredito\",\n" + 
			"        \"longitude\",\n" + 
			"        \"nome\",\n" + 
			"        \"numeroDependentes\",\n" + 
			"        \"numeroIdentidade\",\n" + 
			"        \"numeroParcelas\",\n" + 
			"        \"orgaoIdentidade\",\n" + 
			"        \"profissao\",\n" + 
			"        \"salario\",\n" + 
			"        \"sexo\",\n" + 
			"        \"tempoResidenciaAnos\",\n" + 
			"        \"tempoTrabalhoAnos\",\n" + 
			"        \"uf\",\n" + 
			"        \"valorCompra\",\n" + 
			"        \"valorParcela\"\n" + 
			"    ],\n" + 
			"    \"filters\": {\n" + 
			"        \"numeroCartao\": 5286002841912242,\n" + 
			"        \"valorMinimo\": 18,\n" + 
			"        \"valorMaximo\": 18,\n" + 
			"        \"salarioMinimo\": 2500,\n" + 
			"        \"salarioMaximo\": 4000,\n" + 
			"        \"limiteMinimo\": 100,\n" + 
			"        \"limiteMaximo\": 5000,\n" + 
			"        \"nClusters\": 1\n" + 
			"    }\n" + 
			"}";
	
	public static String KMEANS_PATTERN = "[\n" + 
			"                    {\n" + 
			"                        \"idEventoCompra\": 158009365,\n" + 
			"                        \"cartao\": \"5286087441795722\",\n" + 
			"                        \"dataCompra\": \"2017-11-11T12:34:00\",\n" + 
			"                        \"idOperacao\": 270,\n" + 
			"                        \"valorCompra\": 115.89,\n" + 
			"                        \"numeroParcelas\": 1,\n" + 
			"                        \"valorParcela\": 115.89,\n" + 
			"                        \"idConta\": 2849,\n" + 
			"                        \"idEstabelecimento\": 2787362,\n" + 
			"                        \"codigoMoedaDestino\": 840,\n" + 
			"                        \"codigoMoedaOrigem\": 986,\n" + 
			"                        \"latitude\": -21.1535017,\n" + 
			"                        \"longitude\": -47.8007753,\n" + 
			"                        \"dataEmissao\": \"2015-12-01T01:18:12.663\",\n" + 
			"                        \"dataValidade\": \"2018-12-31T00:00:00\",\n" + 
			"                        \"estadoCivil\": 2,\n" + 
			"                        \"numeroDependentes\": 0,\n" + 
			"                        \"empresa\": \"VALDECI DOS SANTOS ME BAR\",\n" + 
			"                        \"tempoTrabalhoAnos\": 12,\n" + 
			"                        \"profissao\": 12,\n" + 
			"                        \"salario\": 1938.05,\n" + 
			"                        \"nome\": \"FERNANDO ARREPIA\",\n" + 
			"                        \"sexo\": \"F\",\n" + 
			"                        \"orgaoIdentidade\": \"SSPSP\",\n" + 
			"                        \"cpf\": \"99999676987\",\n" + 
			"                        \"numeroIdentidade\": \"3230\",\n" + 
			"                        \"dataNascimento\": \"1954-03-03T00:00:00\",\n" + 
			"                        \"limiteCredito\": 2750,\n" + 
			"                        \"cep\": \"14075090\",\n" + 
			"                        \"uf\": \"SP\",\n" + 
			"                        \"tempoResidenciaAnos\": 27\n" + 
			"                    }\n" + 
			"                    \n" + 
			"                ]";
}
