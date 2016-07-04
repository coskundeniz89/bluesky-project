package net.luversof.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import net.luversof.bbs.domain.Bbs;

@Transactional(readOnly = true)
public interface BbsRepository extends JpaRepository<Bbs, Long> {

	Bbs findByUserId(long userId); 
}
