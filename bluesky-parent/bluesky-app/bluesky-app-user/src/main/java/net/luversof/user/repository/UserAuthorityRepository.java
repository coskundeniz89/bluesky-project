package net.luversof.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import net.luversof.user.domain.UserAuthority;

@Transactional(readOnly = true)
public interface UserAuthorityRepository extends JpaRepository<UserAuthority, Long> {
}
