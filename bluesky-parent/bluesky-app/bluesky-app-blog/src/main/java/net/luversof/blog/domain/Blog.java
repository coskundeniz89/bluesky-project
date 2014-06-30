package net.luversof.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Blog {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "user_id")
	private long userId;
}
