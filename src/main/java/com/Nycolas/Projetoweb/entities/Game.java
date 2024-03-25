package com.Nycolas.Projetoweb.entities;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescripton;
	private String longDescripton;
	
	
	public Game() {
		
	}


	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
			String shortDescripton, String longDescripton) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.imgUrl = imgUrl;
		this.shortDescripton = shortDescripton;
		this.longDescripton = longDescripton;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescripton() {
		return shortDescripton;
	}


	public void setShortDescripton(String shortDescripton) {
		this.shortDescripton = shortDescripton;
	}


	public String getLongDescripton() {
		return longDescripton;
	}


	public void setLongDescripton(String longDescripton) {
		this.longDescripton = longDescripton;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	  
	
}