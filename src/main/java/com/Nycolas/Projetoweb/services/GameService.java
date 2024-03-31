package com.Nycolas.Projetoweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Nycolas.Projetoweb.dto.GameMinDTO;
import com.Nycolas.Projetoweb.entities.Game;
import com.Nycolas.Projetoweb.repositories.GameRepository;

@Component
public class GameService {
     @Autowired
	GameRepository gameRepository;
	
	 public List<GameMinDTO> findAll(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	return dto;
}
}
