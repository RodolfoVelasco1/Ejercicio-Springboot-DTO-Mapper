package com.example.Controller;

import com.example.DTO.MovieCreateDTO;
import com.example.DTO.MovieResponseDTO;
import com.example.DTO.MovieUpdateDTO;
import com.example.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieResponseDTO> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public MovieResponseDTO getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping
    public MovieResponseDTO createMovie(@RequestBody MovieCreateDTO createDTO) {
        return movieService.createMovie(createDTO);
    }

    @PutMapping("/{id}")
    public MovieResponseDTO updateMovie(@PathVariable Long id, @RequestBody MovieUpdateDTO updateDTO) {
        return movieService.updateMovie(id, updateDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok("Película eliminada exitosamente");
    }
}