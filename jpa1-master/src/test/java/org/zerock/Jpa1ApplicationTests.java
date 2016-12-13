package org.zerock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.dao.MemberDAO;
import org.zerock.domain.Member;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class Jpa1ApplicationTests {

	@Autowired
	MemberDAO dao;
	
	
	@Test
	public void contextLoads() {
		
		log.info("DAO : " + dao );
	}
	
	@Test
	public void insertTest(){
		
		for ( int i = 0 ; i < 100 ; i++ ){
			
			Member member = new Member();
			member.setMemberid("user" + i );
			member.setMemberpw("pw" + i );
			member.setMembername("name" + i );
			member.setEmail("aaa" + i + "@gmail.com");
			dao.save(member);
			
		}
	}
	
	@Test
	public void selectTest(){
		
		Member member = dao.findOne("user1");
		log.info("select one : " + member);
		
	}
	
	@Test
	public void selectEmailTest(){
		
		dao.findByEmailContaining("aaa").stream().forEach(member -> log.info(""+ member.getMemberid()));;
	
	}
	
	
	
}

