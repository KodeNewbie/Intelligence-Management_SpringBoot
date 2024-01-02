package com.intelligence.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "intel_list")
public class IntelEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long intel_Id;
	@NotBlank
	private String intel_Title;
	@NotBlank
	private String intel_Details;
	private LocalDate intel_Date;
	private List<String> intel_Files;

}
