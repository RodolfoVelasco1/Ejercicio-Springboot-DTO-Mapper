package com.example.Controller;

import com.example.DTO.MovieCreateDTO;
import com.example.DTO.MovieResponseDTO;
import com.example.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Obtener todas las películas
    @GetMapping
    public List<MovieResponseDTO> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Obtener película por ID
    @GetMapping("/{id}")
    public MovieResponseDTO getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    // Crear nueva película
    @PostMapping
    public MovieResponseDTO createMovie(@RequestBody MovieCreateDTO createDTO) {
        return movieService.createMovie(createDTO);
    }
}