package com.akati.service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akati.controller.AkatiConstants;
import com.akati.controller.ProcessaAnalise;
import com.akati.model.Analise;
import com.akati.model.AnaliseResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AnaliseService {

	private String pathDados = "/transacoes/cartao/5286002841912242";
	private String pathKmeansTrain = "/comportamento/kmeans/train";
	private String pathKmeansPattern = "/comportamento/kmeans/pattern";
	
	@Autowired
	private ProcessaAnalise processaAnalise;
	
	@SuppressWarnings("unchecked")
	public Boolean execute(int valorCompra, int parcelas){
		try {
			
			//disableSslVerification();
			
			ObjectMapper mapper = new ObjectMapper();
			
			//treina o algoritmo de consumo do cliente
			postRequest(pathKmeansTrain, AkatiConstants.KMEANS_EXAMPLE);
			
			//verifica se o sonho nao passou do padrao
			String pegaPadraoConsumo = postRequest(pathKmeansPattern, AkatiConstants.KMEANS_PATTERN);
			
			Boolean saiuDoPadrao = pegaPadraoConsumo.contains("true")? true: false;
			
			if(saiuDoPadrao) return false;
			
			//se estiver dentro do padrao faz um request para pegar dados do cliente
			ResponseEntity<String> getAnalise = getRequest(pathDados);
			
			AnaliseResponse obj = mapper.readValue(getAnalise.getBody(), AnaliseResponse.class);
			
			Analise analise = obj.getData().get(0);
			
			//com a resposta da api processamos com regras estabelecidas
			return processaAnalise.analisa(analise.getSalario(), analise.getProfissao(), analise.getLimiteCredito(), valorCompra, parcelas);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private ResponseEntity<String> getRequest(String path){
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Token 4db52c5d41e2f65c98317db3523ab3ea3ee45c61");
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = (ResponseEntity) restTemplate.exchange("https://ciabhackathon.conductor.com.br:8443" + pathDados, HttpMethod.GET, request, String.class);			
	
		return response;
	}
	
	private String postRequest(String path, String body){
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Token 4db52c5d41e2f65c98317db3523ab3ea3ee45c61");	
		
		HttpEntity<String> request = new HttpEntity<String>(body, headers);
		ResponseEntity<String> response =  (ResponseEntity<String>) restTemplate.exchange("https://ciabhackathon.conductor.com.br:8443" + pathDados, HttpMethod.POST, request, String.class);
		
		return response.getBody();
	}
	
	private static void disableSslVerification() {
	    try
	    {
	        // Create a trust manager that does not validate certificate chains
	        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
	            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
	                return null;
	            }
	            public void checkClientTrusted(X509Certificate[] certs, String authType) {
	            }
	            public void checkServerTrusted(X509Certificate[] certs, String authType) {
	            }
	        }
	        };

	        // Install the all-trusting trust manager
	        SSLContext sc = SSLContext.getInstance("SSL");
	        sc.init(null, trustAllCerts, new java.security.SecureRandom());
	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

	        // Create all-trusting host name verifier
	        HostnameVerifier allHostsValid = new HostnameVerifier() {
	            public boolean verify(String hostname, SSLSession session) {
	                return true;
	            }
	        };

	        // Install the all-trusting host verifier
	        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } catch (KeyManagementException e) {
	        e.printStackTrace();
	    }
	}
}
