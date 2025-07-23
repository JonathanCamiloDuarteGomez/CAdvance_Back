package com.CAdvance.movies;

import com.CAdvance.movies.principal.Principal;
import com.CAdvance.movies.repositry.PeliculaRepository;
import com.CAdvance.movies.repositry.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication implements CommandLineRunner {
	//Las inyecciones de dependencias solo se puede llamar en una clase creada por el propio Spring
	@Autowired//Inyeccion de dependencias
	private PeliculaRepository repositoryPelicula;
	@Autowired
	private UsuarioRepository repositoryUsuario;
	@Value("${API_KEY_OMDB:}")
	private String API_KEY;

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(API_KEY,repositoryPelicula,repositoryUsuario);
		principal.muestraElMenu();

	}
}
