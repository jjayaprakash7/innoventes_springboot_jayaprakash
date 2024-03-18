package com.innoventes.test.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotBlank(message = "Company name is mandatory")
	@Size(min = 5, message = "Company name must be at least 5 characters long")
	private String companyName;

	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email should be valid")
	private String email;

	@Min(value = 0, message = "Strength must be a positive number or zero")
	@NotNull
//	@EvenNumberOrZero
	private Integer strength;

	private String webSiteURL;

	@Pattern(regexp = "^[a-zA-Z]{2}[0-9]{2}[ENen]$", message = "Invalid company code format")
	private String companyCode;
}
