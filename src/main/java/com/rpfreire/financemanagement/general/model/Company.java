package com.rpfreire.financemanagement.general.model;

import com.rpfreire.financemanagement.finance.model.CompanyDetail;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "company")
@Builder
public class Company {
    @Id
    private String id;
    @Indexed(unique = true)
    private String ruc;
    private String comercialName;
    private CompanyDetail companyDetail;
    @Version
    private Long version;
    private List<Location> locationList;

}

