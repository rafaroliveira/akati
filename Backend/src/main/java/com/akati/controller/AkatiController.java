package com.akati.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akati.service.AnaliseService;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class AkatiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private AnaliseService analiseService;
    
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "OLA";
    }
    
    @PostMapping(path = "/gera_proposta", consumes = "application/json", produces = "application/json")
    public Boolean geraProposta(@RequestBody Proposta proposta) {
       
        return analiseService.execute(proposta.getValorCompra(), proposta.getParcelas());
        		
    }
    
    @GetMapping(path = "/getSimulacao", consumes = "application/json", produces = "application/json")
    public String getSimulacao() {
       
        return "{\n" + 
        		"	\"nome_banco\": \"Itaú Unibanco\",\n" + 
        		"	\"parcelas\": [2, 4],\n" + 
        		"	\"taxas\":[1, 1.5],\n" + 
        		"	\"produtos\": [\"cdc\", \"consignado\"]\n" + 
        		"}";
        		
    }
    
}

@Component
class Proposta {
	
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
