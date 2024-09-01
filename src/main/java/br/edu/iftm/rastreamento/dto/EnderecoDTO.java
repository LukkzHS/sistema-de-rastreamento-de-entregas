package br.edu.iftm.rastreamento.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
	private Long id;
	private String rua;
	private String numero;
	private String cidade;
	private String estado;
	private String cep;

}
