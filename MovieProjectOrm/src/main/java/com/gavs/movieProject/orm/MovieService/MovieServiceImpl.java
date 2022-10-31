package com.gavs.movieProject.orm.MovieService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavs.movieProject.orm.MovieBean.MovieBean;
import com.gavs.movieProject.orm.MovieDao.MovieDAOWrapper;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDAOWrapper movieDaoWrapper;
	@Override
	public int addMovieService(MovieBean movie) throws Exception {
		System.out.println("addMovie(MovieBean movie) in serviceImpl is Invoked");
		int resultMovieId=movieDaoWrapper.addMovieDetail(movie);
		
		return resultMovieId;
	}
	@Override
	public Collection<MovieBean> getAllMovieService()throws Exception{
		System.out.println("getAllMovieService() in serviceImpl is invoked");
		Collection<MovieBean> resultMovieDetails=movieDaoWrapper.getAllMovieDetails();
		return resultMovieDetails;
		
	}
	@Override
	public MovieBean getMovieByIdService(int id) throws Exception {
		System.out.println("getMovieByIdService(int id) in serviceImpl is invoked");
		MovieBean resultMovieDetailsByIdService=movieDaoWrapper.getMovieDetailsById(id);
		
		return resultMovieDetailsByIdService;
	}
	@Override
	public int deleteMovieDetailsService(int id) throws Exception {
		System.out.println("deleteMovieDetailsService(int id) in serviceImpl is invoked");
		int resultdeleteMovie=movieDaoWrapper.deleteMovieDetail(id);
		return resultdeleteMovie;
		
	}
	@Override
	public MovieBean updateMovieDetails(MovieBean movie) throws Exception {
		System.out.println("updateMovieDetails(MovieBean movie) in ServiceImpl is invoked");
		MovieBean updMovieDetails=movieDaoWrapper.updateMovieDetail(movie);
		return updMovieDetails;
	}

}
