package com.gavs.movieProject.orm.MovieController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gavs.movieProject.orm.MovieBean.MovieBean;
import com.gavs.movieProject.orm.MovieService.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService movService;
	
	@RequestMapping(value="/addmovie",method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addMovie(@RequestBody MovieBean movie) throws Exception {
		System.out.println("Controller to add movie is invoked");
		int resultMovId=movService.addMovieService(movie);
		return new ResponseEntity<String>("Movie Added with id: "+resultMovId,HttpStatus.OK);
		
	}
	@RequestMapping(value="/getAllMovieDetails",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<MovieBean>>getMovieDetails()throws Exception{
		System.out.println("Controller to getAllMovieDetails is invoked");
		Collection<MovieBean> listMovies=movService.getAllMovieService();
		return new ResponseEntity<Collection<MovieBean>>(listMovies,HttpStatus.OK);
	}
	@RequestMapping(value="/getMovieDetailsById/{id}",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MovieBean>getMovieDetailsById(@PathVariable("id") int id)throws Exception{
		System.out.println("Conroller to getMovieDetailsById is invoked");
		MovieBean findByidObj=movService.getMovieByIdService(id);
		if(findByidObj!=null) {
			return new ResponseEntity<MovieBean>(findByidObj,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<MovieBean>(HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/deleteMovieDetails/{id}",method=RequestMethod.PUT,
			produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String>DeleteMovieDetailsByid(@PathVariable("id")int id)throws Exception{
		System.out.println("Controller to deleteMovieDetailsById is invoked");
		int resultDeleteMovie=movService.deleteMovieDetailsService(id);
		return new ResponseEntity<String>("MovieDetails deleted with id: "+resultDeleteMovie,HttpStatus.OK);
		
	}
	@RequestMapping(value="/updateMovieDetails",method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>updateMovieDetails(@RequestBody MovieBean movie)throws Exception{
		System.out.println("Controller to updateMovieDetails is invoked");
		MovieBean resultupdMovieDetail=movService.updateMovieDetails(movie);
		return new ResponseEntity<String>("Updated employee details: "+resultupdMovieDetail,HttpStatus.OK);
	}
	

}
