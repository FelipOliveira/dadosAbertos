package com.br.foliveira.dacd.dto;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Despesas {
	private String tipoDespesa;
	private String tipoDocumento;
	private String dataDocumento;
	private BigDecimal valorLiquido;
}
