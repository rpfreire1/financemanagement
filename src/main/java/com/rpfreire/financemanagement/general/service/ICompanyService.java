package com.rpfreire.financemanagement.general.service;


import com.rpfreire.financemanagement.general.model.Company;

import java.util.Optional;

public interface ICompanyService {
    Optional<Company>  findCompanyByRuc(String idString);
}
