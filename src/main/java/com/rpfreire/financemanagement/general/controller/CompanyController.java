package com.rpfreire.financemanagement.general.controller;

import com.rpfreire.financemanagement.general.model.Company;
import com.rpfreire.financemanagement.general.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("")
public class CompanyController {
    @Autowired
    private ICompanyService companyService;
    @GetMapping("/{ruc}")
    public ResponseEntity<Optional<Company>> findCompanyByRuc(
            @PathVariable("ruc")String ruc
    ){
        Optional<Company> company=this.companyService.findCompanyByRuc(ruc);
        if (company.isPresent()){
            return ResponseEntity.ok(company);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
