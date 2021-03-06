package net.luversof.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import net.luversof.user.domain.User;
import net.luversof.user.domain.UserType;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	User findByExternalIdAndUserType(String externalId, UserType userType);
}
