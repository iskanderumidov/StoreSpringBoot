package com.moviecraze.store.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviecraze.store.entity.Actor;


public interface ActorRepository extends JpaRepository<Actor, Long>{
//	public Collection<ActorMovieIdsOnly> findByFirstName(String firstName);
}
