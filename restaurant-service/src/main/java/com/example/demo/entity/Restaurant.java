package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//class name should be noun and singular


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name="restaurant_sep_2022")
public class Restaurant {
	
	@Id
	@Column(name="restaurant_id",length=5)
	int restaurantId;
	
	@Column(name="restaurant_name",length=45)
    String restaurantName;
	
	@Column(name="location",length=30)
	String location;
	
	@Column(name="rating",precision=2,scale=5) //example:99.99
	double rating;
	
	@Column(name="opening_date")
	LocalDate openingDate;

}
