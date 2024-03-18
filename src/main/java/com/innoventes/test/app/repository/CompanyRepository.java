package com.innoventes.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.innoventes.test.app.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	@Query(value="SELECT * FROM company c WHERE company_code=?1",nativeQuery = true)
	Company findByCompanyCode(String companyCode);

}