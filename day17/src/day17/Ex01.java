package day17;

class Animal {									// super class 는 클래스간의 공통 속성을 작성할 수 있다
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	void bark() {
		System.out.println(name + " : ...");
	}
}

class Cat extends Animal {
	Cat(String name){
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name + " : 야옹");
	}
	void grooming() {
		System.out.println(name + "가 그루밍을 합니다");
	}
}

class Dog extends Animal {
	Dog(String name){
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name + " : 멍멍");
	}
	void tailing() {
		System.out.println(name + "가 꼬리를 흔듭니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Cat cat = new Cat("꼬미");
		Dog dog = new Dog("몽실이");
		
		cat.bark();
		dog.bark();
		cat.grooming();
		dog.tailing();System.out.println("============================");
		
		Animal a1 = cat;						// 서브클래스의 객체를 슈퍼클래스로 참조하면서 발생하는 형변환을 up-casting이라고 한다
		Animal a2 = dog;						// up-casting된 객체는 메서드 호출 시, 슈퍼클래스를 기반으로 참조한다
		
//		a1.grooming();							// Animal 타입으로 참조하고 있고, Animal에는 메서드가 정의되어 있지 않다
//		a2.tailing();							// 정의되어 있지 않으므로 호출 불가
		
		a1.bark();								// 내용은 바뀌었지만, 슈퍼클래스에 정의되어 있으므로, 일단 호출 가능
		a2.bark();								// 호출되면, 객체가 보유한 메서드가 실행되므로, 서브클래스의 메서드가 실행됨
		
		System.out.println("========================");
		
		Animal[] arr = { a1, a2 };				// 서로 다른 서브클래스의 객체들을 슈퍼클래스로 묶어서 관리
		for(Animal a : arr) {
			a.bark();
			if(a instanceof Cat) {				// a객체는 Animal로 참조되고 있는데, 객체가 Cat의 instance이면 true
				Cat c = (Cat)a;
				c.grooming();
			}
			if(a instanceof Dog) {				// down-casting을 위해서는 instanceof 연산자를 활용 할 수 있다
				Dog d = (Dog)a;
				d.tailing();
			}
		}
		System.out.println("========================");
		for(int i = 0; i < arr.length; i++) {
			Animal a = arr[i];
			String className = a.getClass().getSimpleName();
			switch(className) {
			case "Cat" :
				Cat c = (Cat)a;
				c.grooming();
				break;
			case "Dog" :
				Dog d = (Dog)a;
				d.tailing();
				break;
			}
		}
		
//		1) 참조변수의 자료형에 메서드가 정의되어있으면 호출 가능
//		- 업캐스팅되었을 때 슈퍼클래스에 없는 메서드는 호출 불가능
//		- 서브클래스의 객체가 서브클래스의 메서드를 가지고 있더라도, 슈퍼클래스로 참조되고 있으면 호출 불가능
//		- 단, 오버라이딩 메서드는 슈퍼클래스에 정의되어 있으므로 호출 가능
		
//		2) 업캐스팅이 필요한 경우
//		- 서로 다른 자료형을 묶어서 관리해야 할 경우
//		- 여러 자료형을 한번에 받아서 처리하는 메서드가 필요한 경우
//		- 매개변수가 Cat인 경우와 Dog인 경우를 둘다 만들면 메서드 오버로딩 (중복정의)
//		- 매개변수를 Animal로 처리하면 Cat도 처리가능/Dog도 처리가능(하나의 메서드로 처리가능)
	}
}
