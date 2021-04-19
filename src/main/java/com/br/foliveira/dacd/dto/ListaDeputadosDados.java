package com.br.foliveira.dacd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ListaDeputadosDados {
	private String nome;
	private String siglaPartido;
	private String siglaUf;
}
