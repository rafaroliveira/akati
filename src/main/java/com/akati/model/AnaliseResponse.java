package com.akati.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class AnaliseResponse {
	
	@JsonProperty("time")
	private String time;
	@JsonProperty("totalItens")
	private int totalItens;
	@JsonProperty("data")
	private List<Analise> data;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTotalItens() {
		return totalItens;
	}
	public void setTotalItens(int totalItens) {
		this.totalItens = totalItens;
	}
	public List<Analise> getData() {
		return data;
	}
	public void setData(List<Analise> data) {
		this.data = data;
	}
	
	
}
