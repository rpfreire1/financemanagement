package com.rpfreire.financemanagement.finance.model;

import com.rpfreire.financemanagement.security.model.SecurityUser;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@Builder
public class FinanceUser {
    @Id
    private String idString;
    private SecurityUser securityUser;
    @Version
    private Long version;


}
