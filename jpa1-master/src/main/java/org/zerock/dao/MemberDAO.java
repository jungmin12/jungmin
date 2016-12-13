package org.zerock.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.domain.Member;

public interface MemberDAO extends JpaRepository<Member, String> {
	
	public Collection<Member> findByEmailContaining(String email);

}
