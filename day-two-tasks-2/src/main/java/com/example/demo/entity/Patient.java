package com.example.demo.entity;

import javax.persistence.Column;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Table(name="patient_sep_2022")

public class Patient {

	@Id
	@Column(name="patient_id")
int patientId;
	@Column(name="patient_name")
String patientName;
}
