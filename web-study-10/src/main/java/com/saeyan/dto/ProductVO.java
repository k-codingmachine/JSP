package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * create table product(
code number(5) primary key,
name varchar2(100),
price number(8),
pictureurl VARCHAR2(50),
description VARCHAR2(1000)
); 
 */



@Getter
@Setter
@ToString
public class ProductVO {

	private int code;
	private String name;
	private int price;
	private String pictureurl;
	private String description;
	
}
