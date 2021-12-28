package com.thewell.model;

import lombok.Data;

@Data
public class MemberDTO {
	
	private int idx, grade;
	private String id, pw, name, tel, email, post, address, address_detail, agree_sns, agree_email, is_producer, exit_yn, join_date, exit_date;
}
