package com.rpfreire.financemanagement.general.repository;

import com.rpfreire.financemanagement.general.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CompanyRepository extends MongoRepository<Company, String> {
    Optional<Company> findCompanyByRuc(String ruc);
}
