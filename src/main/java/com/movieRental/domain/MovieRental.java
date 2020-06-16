package com.movieRental.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "MOVIE_RENTALS")
public class MovieRental {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TRANSACTION_DATE")
	private LocalDate transactionDate;

	@Column(name = "ID_CLIENT")
	private Integer idClient;

	@Column(name = "MOVIE_ID")
	private Integer movieId;

	@Column(name = "RETURN_DATE")
	private LocalDate returnDate;

}
