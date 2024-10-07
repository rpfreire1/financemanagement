package com.rpfreire.financemanagement;

import com.rpfreire.financemanagement.security.enums.RoleEnum;
import com.rpfreire.financemanagement.security.model.Permission;
import com.rpfreire.financemanagement.security.model.Role;
import com.rpfreire.financemanagement.security.model.SecurityUser;
import com.rpfreire.financemanagement.security.repository.SecurityUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class FinancemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancemanagementApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SecurityUserRepository securityUserRepository){
		return args -> {
			Permission createPermission= Permission.builder()
					.name("CREATE")
					.description("Can create objects")
					.build();
			Permission readPermission= Permission.builder()
					.name("READ")
					.description("Can read objects")
					.build();
			Permission modifyPermission= Permission.builder()
					.name("MODIFY")
					.description("Can modify objects")
					.build();
			Permission deletePermission= Permission.builder()
					.name("DELETE")
					.description("Can delete objects")
					.build();
			Role roleAdmin = Role.builder()
					.roleEnum(RoleEnum.ADMIN)
					.permissions(Set.of(createPermission, readPermission, deletePermission))
					.build();
			Role roleSupervisor = Role.builder()
					.roleEnum(RoleEnum.USER)
					.permissions(Set.of( readPermission))
					.build();



			SecurityUser securityUser=SecurityUser.builder()
//					.id("ppspspspspspsps")
					.username("rfreire")
					.password("123581321a")
					.isEnabled(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleAdmin))
					.build();

			securityUserRepository.save(securityUser);
		};

	}
}
