package com.CAdvance.movies.dto;

import com.CAdvance.movies.model.Categoria;

public record PeliculaDTO(
        Long id,
        String titulo,
        Integer ano_Estreno,
        String director,
        Double evaluacion,
        String poster,
        Categoria genero,
        String actores,
        String sinopsis
) {
}
