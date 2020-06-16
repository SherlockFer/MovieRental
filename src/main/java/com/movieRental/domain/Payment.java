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
@Table(name = "PAYMENTS")
public class Payment {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "ID_CLIENT")
	private Integer idClient;

	@Column(name = "PAYMENT_DATE")
	private LocalDate paymentDate;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "AMOUNT_PAID")
	private Integer amountPaid;

	@Column(name = "REFERENCE_NUMBER")
	private Integer referenceNumber;

}
