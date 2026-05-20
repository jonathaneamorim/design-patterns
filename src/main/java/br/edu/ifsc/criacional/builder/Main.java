package br.edu.ifsc.criacional.builder;

public class Main {
    public static void main(String[] args) {
        // Usuario usuario = new Usuario(); Não dá mais de instanciar usuario
        Usuario usuario = new Usuario.Builder()
                .withTelefone("00000000000")
                .withCPF("000000000000")
                .withDataNascimento("10/06/2026")
                .withName("Joao da silva")
                .build();

        Aluno aluno = Aluno.builder()
                .nome("Jose")
                .codigo("19191")
                .cpf("kakakaka")
                .build();

        System.out.println(aluno);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCodigo());
        System.out.println(aluno.getCpf());

    }
}
