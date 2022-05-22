package com.group6.W10.model;
/*
 * Kelompok 6
 * Anggota: 211524034 - Aini Nurul Azizah
 * 			211524059 - Reza Ananta Permadi Supriyo
 * 			211524061 - Rofa'ul Akrom Hendrawan
 * */
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
	//mark class as an Entity   
	@Entity  
	//defining class name as Table name  
	@Table  
	public class Movie  
	{  
	//Defining movie id as primary key  
	@Id  
	@Column
	private int id;
	@Column  
	private String title;  
	@Column  
	private String genre;  
	@Column  
	private String director;  
	@Column  
	private int rilis;  

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public String getTitle(){
	return title;  
}  
public void setTitle(String title){
	this.title = title;  
}  
public String getGenre(){
	return genre;  
}  
public void setGenre(String genre){
	this.genre = genre;  
}  
public String getDirector(){
	return director;  
}  
public void setDirector(String director){
	this.director = director;  
}  
public int getRilis(){
	return rilis;  
}  
public void setRilis(int rilis){
	this.rilis = rilis;  
}  
}  
