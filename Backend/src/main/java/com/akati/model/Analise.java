package com.akati.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Analise {
	
	@JsonProperty("idEventoCompra")
	private int idEventoCompra;
	@JsonProperty("cartao")
	private String cartao;
	@JsonProperty("dataCompra")
	private String dataCompra;
	@JsonProperty("idOperacao")
	private int idOperacao;
	@JsonProperty("valorCompra")
	private int valorCompra;
	@JsonProperty("numeroParcelas")
	private int numeroParcelas;
	@JsonProperty("valorParcela")
    private int valorParcela;
	@JsonProperty("idConta")
    private int idConta;
	@JsonProperty("idEstabelecimento")
    private int idEstabelecimento;
	@JsonProperty("codigoMoedaDestino")
    private int codigoMoedaDestino;
	@JsonProperty("codigoMoedaOrigem")
    private int codigoMoedaOrigem;
	@JsonProperty("latitude")
    private int latitude;
	@JsonProperty("longitude")
    private int longitude;
	@JsonProperty("dataEmissao")
    private String dataEmissao;
	@JsonProperty("dataValidade")
    private String dataValidade;
	@JsonProperty("estadoCivil")
    private int estadoCivil;
	@JsonProperty("numeroDependentes")
    private int numeroDependentes;
    @JsonProperty("empresa")
    private String empresa;
    @JsonProperty("tempoTrabalhoAnos")
    private int tempoTrabalhoAnos;
    @JsonProperty("profissao")
    private int profissao;
    @JsonProperty("salario")
    private double salario;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("orgaoIdentidade")
    private String orgaoIdentidade;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("numeroIdentidade")
    private String numeroIdentidade;
    @JsonProperty("dataNascimento")
    private String dataNascimento;
    @JsonProperty("limiteCredito")
    private int limiteCredito;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("tempoResidenciaAnos")
    private int tempoResidenciaAnos;
    
	public int getIdEventoCompra() {
		return idEventoCompra;
	}
	public void setIdEventoCompra(int idEventoCompra) {
		this.idEventoCompra = idEventoCompra;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public int getIdOperacao() {
		return idOperacao;
	}
	public void setIdOperacao(int idOperacao) {
		this.idOperacao = idOperacao;
	}
	public int getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	public int getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(int valorParcela) {
		this.valorParcela = valorParcela;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public int getIdEstabelecimento() {
		return idEstabelecimento;
	}
	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	public int getCodigoMoedaDestino() {
		return codigoMoedaDestino;
	}
	public void setCodigoMoedaDestino(int codigoMoedaDestino) {
		this.codigoMoedaDestino = codigoMoedaDestino;
	}
	public int getCodigoMoedaOrigem() {
		return codigoMoedaOrigem;
	}
	public void setCodigoMoedaOrigem(int codigoMoedaOrigem) {
		this.codigoMoedaOrigem = codigoMoedaOrigem;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public int getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getTempoTrabalhoAnos() {
		return tempoTrabalhoAnos;
	}
	public void setTempoTrabalhoAnos(int tempoTrabalhoAnos) {
		this.tempoTrabalhoAnos = tempoTrabalhoAnos;
	}
	public int getProfissao() {
		return profissao;
	}
	public void setProfissao(int profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getOrgaoIdentidade() {
		return orgaoIdentidade;
	}
	public void setOrgaoIdentidade(String orgaoIdentidade) {
		this.orgaoIdentidade = orgaoIdentidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumeroIdentidade() {
		return numeroIdentidade;
	}
	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getTempoResidenciaAnos() {
		return tempoResidenciaAnos;
	}
	public void setTempoResidenciaAnos(int tempoResidenciaAnos) {
		this.tempoResidenciaAnos = tempoResidenciaAnos;
	}
    
}
