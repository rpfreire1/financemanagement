package com.rpfreire.financemanagement.general.service.implementation;

import com.rpfreire.financemanagement.general.model.Company;
import com.rpfreire.financemanagement.general.repository.CompanyRepository;
import com.rpfreire.financemanagement.general.service.ICompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public Optional<Company> findCompanyByRuc(String idString) {
        return this.companyRepository.findCompanyByRuc(idString);
    }
}
