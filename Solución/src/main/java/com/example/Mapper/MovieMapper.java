package com.example.Mapper;

import com.example.DTO.MovieCreateDTO;
import com.example.DTO.MovieResponseDTO;
import com.example.Entity.Movie;

public class MovieMapper {

    public static MovieResponseDTO toResponseDTO(Movie movie) {
        MovieResponseDTO dto = new MovieResponseDTO();
        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setGenre(movie.getGenre());
        return dto;
    }

    public static Movie toEntity(MovieCreateDTO dto) {
        Movie movie = new Movie();
        movie.setTitle(dto.getTitle());
        movie.setGenre(dto.getGenre());
        movie.setReleaseYear(dto.getReleaseYear());
        movie.setDirector(dto.getDirector());
        movie.setDurationInMinutes(dto.getDurationInMinutes());
        movie.setDescription(dto.getDescription());
        return movie;
    }
}
