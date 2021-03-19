package day17;

import java.util.Scanner;

class A extends Object{
	
	@Override
	public String toString() { 
		return this.getClass().getSimpleName();
	}
}
class B extends A {
	@Override
	public String toString() {
		return "내가 직접 오버라이딩 한 메서드";
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A ob1 = new A();			// 아무 내용이 없어도, JVM에 의해서 기본 생성자가 만들어진다
		B ob2 = new B();			// 서브클래스의 생성자는 기본적으로 usper() 를 호출하도록 만들어진다
		
		System.out.println(ob1.getClass());
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.toString());
		System.out.println(ob2);	// println() 는 객체를 전달받아서 객체의 toString()을 출력한다
		
		Object[] arr = { ob1, ob2 , new Scanner(System.in) };
		for(Object ob : arr) {
			System.out.println(ob);
		}
	}
}
