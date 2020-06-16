package com.movieRental.domain;

import java.time.LocalDate;
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
@Table(name = "MEMBERS")
public class Member {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "DATE")
	private LocalDate date;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "POSTAL_CODE")
	private String PostalCode;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "MEMBER_ID")
	private Set<Payment> payments;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "MEMBER_ID")
	private Set<MovieRental> movieRentals;

}
