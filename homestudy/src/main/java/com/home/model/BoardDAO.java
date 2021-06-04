package com.home.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BoardDAO {

	@Select("select * from board2 order by idx desc")
	List<BoardDTO> selectList();
	
	@Insert("insert into board2 (idx, title, writer, content) values (board2_seq.nextval, #{title}, #{writer}, #{content}")
	void insert(BoardDTO dto);

}
