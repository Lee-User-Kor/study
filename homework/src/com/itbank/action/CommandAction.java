package com.itbank.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인터페이스는 추상클래스의 한 종류이며, extends에 상관없이 상속받을 수 있고, 추상메서드를 강제로 구현해야 한다
// 모든 메서드는 public abstract 속성을 가진다

public interface CommandAction {
	String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable;
	String doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
