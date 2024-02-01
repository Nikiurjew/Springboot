package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")

public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator1")
@Column(name="customer_id")
private long customerId;

private String firstName;



}
