package org.zerock.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_member")
@Getter
@Setter
@ToString
public class Member {
	
	@Id
	private String memberid;
	
	@Column(nullable=false)
	private String memberpw;
	
	@Column(nullable=false)
	private String membername;
	
	@Column(nullable=false)
	private String email;

}
