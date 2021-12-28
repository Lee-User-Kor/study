package com.thewell.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thewell.model.MemberDTO;

@Service
public class HomeService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	
	public MemberDTO test() {
		return sqlSession.selectOne("test");
	}
	public MemberDTO test2() {
		return sqlSession.selectOne("test2");
	}
}
