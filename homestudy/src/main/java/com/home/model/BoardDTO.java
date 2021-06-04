package com.home.model;

//	BOARD2
//	IDX	NUMBER
//	TITLE	VARCHAR2(200 BYTE)
//	WRITER	VARCHAR2(200 BYTE)
//	CONTENT	VARCHAR2(2000 BYTE)
//	WRITEDATE	VARCHAR2(20 BYTE)
//	VIEWCOUNT	NUMBER
public class BoardDTO {
	
	private int idx, viewCount;
	private String title, writer, content, writeDate;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	
	
	
	
}
