package com.example.Service;

import com.example.DTO.MovieCreateDTO;
import com.example.DTO.MovieResponseDTO;
import com.example.Entity.Movie;
import com.example.Mapper.MovieMapper;
import com.example.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieResponseDTO> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(MovieMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public MovieResponseDTO getMovieById(Long id) {
        Movie movie = movieRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Película no encontrada con ID: " + id)
        );
        return MovieMapper.toResponseDTO(movie);
    }

    public MovieResponseDTO createMovie(MovieCreateDTO createDTO) {
        Movie movie = MovieMapper.toEntity(createDTO);
        Movie savedMovie = movieRepository.save(movie);
        return MovieMapper.toResponseDTO(savedMovie);
    }
}