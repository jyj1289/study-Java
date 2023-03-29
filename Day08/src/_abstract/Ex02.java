package _abstract;

import other.Animal;
import other.FlyAble;

/*
 * 	클래스의 상속은 기존의 기능을 물려 받아서 기능을 더 추가한 클래스를 만들기 위함
 * 	따라서, 기능을 확장하기 때문에 extends로 상속한다
 * 
 * 	인터페이스의 상속은 아무것도 없는 껍데기를 상속 받고
 * 	이를, 자식 클래스에서 직접 오버라이드해서 구현하게 한다
 * 	즉, 특정 메서드를 해당 클래스에 구현하기 위해서 사용한다
 * 	따라서, 특정 기능을 구현하게 하기 때문에 implements로 상속한다
 * 
 */

class Bird extends Animal implements FlyAble{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(type + "로 날아간다");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("짹잭");
	}
	
}

class Airplane implements FlyAble{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("엔진으로 날아간다");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bir = new Bird();
		
		Airplane air = new Airplane();
		
		// 동물들 모여라
		// - 동물이 아닌 비행기는 낄 수 없다
		Animal[] anis = new Animal[] { dog, cat, bir };
		
		for (int i = 0; i < anis.length; i++) {
			anis[i].bark();
			// anis[i].fly();
		}
		System.out.println();
		
		// 날 수 있는 객체들 모여라
		// - 날 수 없는 강아지와 고양이는 낄 수 없다
		FlyAble[] flys = new FlyAble[] { bir, air };
		
		for (int i = 0; i < flys.length; i++) {
			// flys[i].bark();
			flys[i].fly();
		}
	}
}
