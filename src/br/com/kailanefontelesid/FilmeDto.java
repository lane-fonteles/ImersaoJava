package br.com.kailanefontelesid;


import java.util.Objects;

public class FilmeDto {

    private String nome;
    private String genero;
    private String estudio;
    private int percentualAudiencia;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getPercentualAudiencia() {
        return percentualAudiencia;
    }

    public void setPercentualAudiencia(int percentualAudiencia) {
        this.percentualAudiencia = percentualAudiencia;
    }

    public double getLucrativade() {
        return lucrativade;
    }

    public void setLucrativade(double lucrativade) {
        this.lucrativade = lucrativade;
    }

    public int getAprovacaoPremio() {
        return aprovacaoPremio;
    }

    public void setAprovacaoPremio(int aprovacaoPremio) {
        this.aprovacaoPremio = aprovacaoPremio;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    private double lucrativade;
    private int aprovacaoPremio;
    private String faturamento;
    private int anoLancamento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmeDto filmeDto = (FilmeDto) o;
        return nome.equals(filmeDto.nome) && estudio.equals(filmeDto.estudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estudio);
    }

    @Override
    public String toString() {
        return "FilmeDto{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                ", percentualAudiencia=" + percentualAudiencia +
                ", lucrativade=" + lucrativade +
                ", aprovacaoPremio=" + aprovacaoPremio +
                ", faturamento='" + faturamento + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
