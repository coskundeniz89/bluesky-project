package net.luversof.bookkeeping.repository;

import java.util.List;

import net.luversof.bookkeeping.domain.Entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface EntryRepository extends JpaRepository<Entry, Long>, QueryDslPredicateExecutor<Entry> {
	List<Entry> findByAssetUsername(String username);
}
