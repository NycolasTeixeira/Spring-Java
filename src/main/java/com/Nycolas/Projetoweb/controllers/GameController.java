package com.Nycolas.Projetoweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nycolas.Projetoweb.dto.GameMinDTO;
import com.Nycolas.Projetoweb.entities.Game;
import com.Nycolas.Projetoweb.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
 
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO > findAll(){
	 List<GameMinDTO> result = gameService.findAll();
	 return result;
 }
}
