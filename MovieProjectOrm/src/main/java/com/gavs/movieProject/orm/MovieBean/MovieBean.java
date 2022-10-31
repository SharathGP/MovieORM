package com.gavs.movieProject.orm.MovieBean;

public class MovieBean {
	
		private int movieId;
		private String movieName;
		private int rating;
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
			return "MovieBean [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + ", dName=" + dName
					+ "]";
		}
		

	}



