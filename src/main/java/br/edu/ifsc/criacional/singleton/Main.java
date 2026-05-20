package br.edu.ifsc.criacional.singleton;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        FormatadorSingleton fmt = FormatadorSingleton.getInstance();
        System.out.println(fmt.formatar(FormatadorSingleton.Tipo.DD_MM_YYYY, new Date()));
        fmt.listarLogs();
    }
}
