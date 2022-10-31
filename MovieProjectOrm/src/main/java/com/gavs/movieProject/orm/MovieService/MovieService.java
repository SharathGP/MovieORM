package com.gavs.movieProject.orm.MovieService;

import java.util.Collection;

import com.gavs.movieProject.orm.MovieBean.MovieBean;

public interface MovieService {
	int addMovieService(MovieBean movie)throws Exception;
	
	Collection<MovieBean> getAllMovieService()throws Exception;
	
	MovieBean getMovieByIdService(int id)throws Exception;
	
	int deleteMovieDetailsService(int id)throws Exception;
	
	MovieBean updateMovieDetails(MovieBean movie)throws Exception;
}
