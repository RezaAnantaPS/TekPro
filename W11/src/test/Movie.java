/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Rofa'ul
 */
public class Movie {  
	//Defining movie id as primary key  
	private int id;
	private String title;   
	private String genre;  
	private String director;   
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

      
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return getId() + " | " + getTitle() + " | " + getGenre() + " | " + getDirector() + " | " + getRilis();
    	}
}