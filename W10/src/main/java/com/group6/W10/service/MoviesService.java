package com.group6.W10.service;
/*
 * Kelompok 6
 * Anggota: 211524034 - Aini Nurul Azizah
 * 			211524059 - Reza Ananta Permadi Supriyo
 * 			211524061 - Rofa'ul Akrom Hendrawan
 * */
import java.util.ArrayList;
import java.util.List;

import com.group6.W10.model.Movie;
import com.group6.W10.repository.MoviesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
//defining the business logic  
@Service  
public class MoviesService{  
	@Autowired  
	MoviesRepository moviesRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
public List<Movie> getAllMovies(){
	List<Movie> movies = new ArrayList<Movie>();  
	moviesRepository.findAll().forEach(movies1 -> movies.add(movies1));  
	return movies;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Movie getMovieById(int id){
	return moviesRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Movie movies){
	moviesRepository.save(movies);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id){
	moviesRepository.deleteById(id);  
}  
//updating a record  
public void update(Movie movies, int id){
	moviesRepository.save(movies);  
}  
}  
