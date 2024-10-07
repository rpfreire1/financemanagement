package com.rpfreire.financemanagement.security.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface ISecurityUserService {
    public UserDetails loadUserByUsername(String username);

}
