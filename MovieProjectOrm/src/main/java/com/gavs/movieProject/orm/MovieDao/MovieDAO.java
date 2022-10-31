package com.gavs.movieProject.orm.MovieDao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gavs.movieProject.orm.MovieEntity.MovieEntity;

public interface MovieDAO extends JpaRepository<MovieEntity,Integer>{

	

	

}
