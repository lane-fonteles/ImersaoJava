package br.com.kailanefontelesid;

import java.io.IOException;

public class Aplicacao {
    public static void main(String [] args) throws IOException {
        FilmeStrategy filmeStrategy = FilmeFactory.criarFabrica();

        filmeStrategy.buscarFilmes();

    }
}
