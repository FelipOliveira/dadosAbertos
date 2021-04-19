package com.br.foliveira.dacd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	@Autowired
	private RestTemplate restTemplate;
	
	private final String DADOS_ABERTOS_API = "https://dadosabertos.camara.leg.br/api/v2/deputados";
	
	@GetMapping("/deputados")
	public ResponseEntity<Object> getAllParlamentares() {		
		String url = DADOS_ABERTOS_API + "?itens=5";
		Object lista = restTemplate.getForObject(url, Object.class);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/deputados/{id}")
	public ResponseEntity<Object> getParlamentarById(@PathVariable Integer id) {
		String url = DADOS_ABERTOS_API + "/{id}";
		Object dados = restTemplate.getForObject(url, Object.class, id);
		return ResponseEntity.ok(dados);
	}
	
	@GetMapping("/deputados/{id}/despesas")
	public ResponseEntity<Object> getDespesasById(@PathVariable Integer id) {
		String url = DADOS_ABERTOS_API + "/{id}/despesas?ano=2021&itens=5&ordem=desc&ordenarPor=mes";
		Object dados = restTemplate.getForObject(url, Object.class, id);
		return ResponseEntity.ok(dados);
	}
}
