package br.edu.ifsc.criacional.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Aluno {
    private String nome;
    private String codigo;
    private String cpf;
}
