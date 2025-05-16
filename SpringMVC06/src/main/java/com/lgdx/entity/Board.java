package com.lgdx.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1씩 자동 증가!
	private long idx;
	
	private String title;
	
	@Column(length = 2000)
	private String contents;
	
	@Column(updatable = false)// 수정 불가 기능!
	private String writer;
	
	@Column(insertable = false, updatable = false, columnDefinition = "int default 0")
	private Long count;
	
	@Column(insertable = false, updatable = false, columnDefinition = "datetime default now()")
	private Date indate;//db니까 sql로!
	
}

