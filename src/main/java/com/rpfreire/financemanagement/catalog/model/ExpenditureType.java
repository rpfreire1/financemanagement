package com.rpfreire.financemanagement.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ExpenditureType {
    @Id
    private String code;
    private String name;

}
