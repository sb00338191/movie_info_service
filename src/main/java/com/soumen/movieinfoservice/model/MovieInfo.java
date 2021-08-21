package com.soumen.movieinfoservice.model;

public class MovieInfo {
	
	private int movieid;
	private String name;
	
	public MovieInfo() {
		super();
	}

	public MovieInfo(int movieid, String name) {
		super();
		this.movieid = movieid;
		this.name = name;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieid=" + movieid + ", name=" + name + "]";
	}
	
	

}
