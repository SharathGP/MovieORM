package com.gavs.movieProject.orm.MovieEntity;


import javax.persistence.*; 

@Entity
@Table(name="movieDetails")
public class MovieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int movieId;
	
	@Column(name="MovieName")
	private String movieName;
	
	@Column(name="Rating")
	private int rating;
	
	@Column(name="DirectorName")
	private String dName;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "MovieEntity [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + ", dname="
				+ dName + "]";
	}

}
