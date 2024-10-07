package com.rpfreire.financemanagement.security.repository;

import com.rpfreire.financemanagement.security.model.SecurityUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SecurityUserRepository extends MongoRepository<SecurityUser, String> {
    Optional<SecurityUser> findSecurityUserByUsername(String username);
}
