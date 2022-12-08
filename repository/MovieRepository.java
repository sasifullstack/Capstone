package com.moviereview.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviereview.capstone.entity.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

	
	  
    @Modifying
	@Query("update Movie  set name=:name where id=:id")
    void updateMovieById(String name, Long id);

}
