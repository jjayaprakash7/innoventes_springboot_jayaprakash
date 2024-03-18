package com.innoventes.test.app.service;

import java.util.List;
import java.util.Map;

import javax.naming.directory.InvalidAttributesException;

import com.innoventes.test.app.entity.Company;
import com.innoventes.test.app.exception.ResourceNotFoundException;
import com.innoventes.test.app.exception.ValidationException;

public interface CompanyService {

	List<Company> getAllCompanies();

	Company addCompany(Company company) throws ValidationException;

	Company updateCompany(Long id, Company company) throws ValidationException;
	
	void deleteCompany(Long id);

	Company getCompanyById(long id);

	Company getCompanyByCompanyCode(String companyCode) throws InvalidAttributesException,ResourceNotFoundException;

	Company updateCompanyByFields(long id, Map<String, Object> companyVO);
}