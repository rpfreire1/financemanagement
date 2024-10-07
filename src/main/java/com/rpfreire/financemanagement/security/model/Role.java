package com.rpfreire.financemanagement.security.model;

import com.rpfreire.financemanagement.security.enums.RoleEnum;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class Role {

    private RoleEnum roleEnum;
    private String description;

    private Set<Permission> permissions=new HashSet<>();

}
