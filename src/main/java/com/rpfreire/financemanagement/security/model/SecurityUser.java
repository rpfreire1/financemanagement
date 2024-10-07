package com.rpfreire.financemanagement.security.model;

import com.rpfreire.financemanagement.catalog.model.Person;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@Document(collection = "users")
public class SecurityUser {
    private String id;
    private String username;
    private String password;
    private Boolean isEnabled;
    private Boolean accountNoExpired;
    private Boolean accountNoLocked;
    private Boolean credentialNoExpired;
    private Set<Role> roles= new HashSet<>();


}
