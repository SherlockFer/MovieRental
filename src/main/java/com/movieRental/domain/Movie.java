package com.movieRental.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "MOVIES")
public class Movie {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DIRECTOR")
	private String director;

	@Column(name = "YEAR")
	private String year;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "MOVIE_ID")
	private Set<MovieRental> movieRentals;

}
