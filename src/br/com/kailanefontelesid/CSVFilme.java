package br.com.kailanefontelesid;

import br.com.kailanefontelesid.FilmeDto;
import br.com.kailanefontelesid.FilmeStrategy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFilme implements FilmeStrategy {

    private static final String CSV_FILE = System.getProperty("user.home") + "/ImersaoJava/movies.csv";
    public static final int POSICAO_NOME = 0;
    public static final int POSICAO_GENERO = 1;
    public static final int POSICAO_ESTUDIO = 2;
    public static final int POSICAO_PERCENTUAL_AUDIENCIA = 3;
    public static final int POSICAO_LUCRATIVIDADE = 4;
    public static final int ANO_LANCAMENTO = 7;


    @Override
    public List<FilmeDto> buscarFilmes() throws IOException {

        var csvFile = Paths.get(CSV_FILE);

        var filmes = new ArrayList<FilmeDto>();

        if (Files.exists(csvFile)) {

            var lines = Files.readAllLines(csvFile, StandardCharsets.UTF_8);

            lines.forEach(line -> {

                var conteudo = line.split(",");
                var filmeDto = new FilmeDto();
                filmeDto.setNome(conteudo[POSICAO_NOME]);
                filmeDto.setGenero(conteudo[POSICAO_GENERO]);
                filmeDto.setEstudio(conteudo[POSICAO_ESTUDIO]);
                filmeDto.setPercentualAudiencia(Integer.parseInt(conteudo[POSICAO_PERCENTUAL_AUDIENCIA]));
                filmeDto.setLucrativade(Double.parseDouble(conteudo[POSICAO_LUCRATIVIDADE]));
                filmeDto.setAnoLancamento(Integer.parseInt( conteudo[ANO_LANCAMENTO]));
                filmes.add(filmeDto);
            });

            return filmes;
        }

        return new ArrayList<>();

    }
}
