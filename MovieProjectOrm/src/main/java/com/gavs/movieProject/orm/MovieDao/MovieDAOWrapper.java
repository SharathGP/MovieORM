package com.gavs.movieProject.orm.MovieDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gavs.movieProject.orm.MovieBean.MovieBean;
import com.gavs.movieProject.orm.MovieEntity.MovieEntity;

@Repository
public class MovieDAOWrapper {
	@Autowired
	MovieDAO movieDao;
	
	public Integer addMovieDetail(MovieBean movie) {
		System.out.println("addMovieDetail(MovieBean movie) method from moviedaoWrapper is invoked");
		MovieEntity mov=new MovieEntity();
		BeanUtils.copyProperties(movie, mov);
		MovieEntity resultmovEntity=movieDao.save(mov);
		return resultmovEntity.getMovieId();
	}
	
	public List<MovieBean> getAllMovieDetails(){
		System.out.println("getAllMovieDetails() method from DAOwrapper is invoked");
		
		Iterable<MovieEntity> listEntity=movieDao.findAll();
		
		List<MovieBean> listBeanobj=new ArrayList<MovieBean>();
		
		listEntity.forEach(moventity->{
				MovieBean movBean=new MovieBean();
				BeanUtils.copyProperties(moventity, movBean);
				listBeanobj.add(movBean);
		});
		return listBeanobj;
		
	}
	
	public MovieBean getMovieDetailsById(int id) {
		System.out.println("getMovieDetailsById(int id) method from DaoWrapper is invoked");
		MovieBean resultDetails=null;
		MovieEntity findbyId=movieDao.findOne(id);
		if(findbyId!=null) {
		resultDetails=new MovieBean();	
		BeanUtils.copyProperties(findbyId, resultDetails);
		}
		return resultDetails;
	}
	public Integer deleteMovieDetail(int id) {
		System.out.println("deleteMovieDetails(int id) method from DaoWrapper is invoked");
		movieDao.delete(id);
		return id;
		
	}
	public MovieBean updateMovieDetail(MovieBean movie) {
		System.out.println("UpdateMovieDetails(MovieBean movie) method from DaoWrapper is invoked");
		MovieEntity updmoventity=movieDao.findOne(movie.getMovieId());
		BeanUtils.copyProperties(movie, updmoventity);
		movieDao.save(updmoventity);
		return movie;
	}

}
