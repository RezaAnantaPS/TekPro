package com.group6.W10.controller;
/*
 * Kelompok 6
 * Anggota: 211524034 - Aini Nurul Azizah
 * 			211524059 - Reza Ananta Permadi Supriyo
 * 			211524061 - Rofa'ul Akrom Hendrawan
 * */
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.group6.W10.model.Movie;  
import com.group6.W10.service.MoviesService;  
//mark class as Controller  
@RestController  
public class MoviesController   {  
	//autowire the MoviesService class  
	@Autowired  
	MoviesService moviesService;  
//creating a get mapping that retrieves all the movies detail from the database   
@GetMapping("/movie")  
private List<Movie> getAllMovies()   {  
	return moviesService.getAllMovies();  
}  
//creating a get mapping that retrieves the detail of a specific movie  
@GetMapping("/movie/{id}")  
private Movie getMovie(@PathVariable("id") int id)   {  
	return moviesService.getMovieById(id);  
}  
//creating a delete mapping that deletes a specified movie  
@DeleteMapping("/movie/{id}")  
private void deleteMovie(@PathVariable("id") int id)   {  
	moviesService.delete(id);  
}  
//creating post mapping that post the movie detail in the database  
@PostMapping("/movies")  
private String saveMovie(@RequestBody Movie movies)   {  
	moviesService.saveOrUpdate(movies);  
	return movies.getTitle();  
}  
//creating put mapping that updates the movie detail   
@PutMapping("/movies")  
private Movie update(@RequestBody Movie movies)   {  
	moviesService.saveOrUpdate(movies);  
	return movies;  
}  
}  