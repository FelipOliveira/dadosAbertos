package com.br.foliveira.dacd.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeputadoDados {
	@JsonIgnore
	private Integer id;
	private String nomeCivil;
	private String dataNascimento;
	private String sexo;
	private DeputadoUltimoStatus ultimoStatus;
}
