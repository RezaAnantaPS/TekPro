package com.group6.W10.repository;
/*
 * Kelompok 6
 * Anggota: 211524034 - Aini Nurul Azizah
 * 			211524059 - Reza Ananta Permadi Supriyo
 * 			211524061 - Rofa'ul Akrom Hendrawan
 * */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.group6.W10.model.Movie;
@Repository  
//repository that extends CrudRepository  
public interface MoviesRepository extends CrudRepository<Movie, Integer>  {
	
}  