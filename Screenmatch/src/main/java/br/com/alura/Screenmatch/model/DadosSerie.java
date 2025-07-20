package br.com.alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
    @Override
    public String toString() {
        return String.format("Titulo: %s" + "\nTotal de temporadas: %d" + "\nAvaliação: %s", titulo, totalTemporadas,
                avaliacao);
    }
}


