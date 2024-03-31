package com.Nycolas.Projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nycolas.Projetoweb.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
