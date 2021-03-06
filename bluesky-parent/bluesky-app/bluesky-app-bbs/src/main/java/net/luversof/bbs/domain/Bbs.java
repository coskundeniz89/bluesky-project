package net.luversof.bbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(indexes = @Index(name = "IDX_Bbs_alias", columnList = "alias", unique = true) )
public class Bbs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 15)
	private String alias;
	
	private boolean isBbsActivated;
	
	private boolean isArticleActivated;
	
	private boolean isReplyActivated;
	
	private boolean isCommentActivated;
	
}
