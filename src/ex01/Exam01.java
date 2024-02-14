package ex01;

class A {
	void funA() {
		System.out.println("funA");
	}
	void funD() {
		System.out.println("A funD");
	}
}

class B extends A {
	void funB() {
		System.out.println("funB");
	}void funD() {
		System.out.println("B funD");
	}
}

class C extends B {
	void funC() {
		System.out.println("funC");
	}void funD() {
		System.out.println("C funD");
	}
}

public class Exam01 {

	static void testFunc(A a) {
		// funA, funB, funC를 출력하려면 어떻게 해야하나?
		
//		if(a instanceof C) {
//			C c = (C)a;
//			c.funC();
//		}else if (a instanceof B) {
//			B b = (B)a;
//			b.funB();
//		}else
//			a.funA();

		if (a instanceof C) {
			((C) a).funC();
		} else if (a instanceof B) {
			((B) a).funB();
		} else {
			a.funA();
		}
		a.funD();

	}

	public static void main(String[] args) {
		
		//상위클래스는 하위클래스 참조가능
		//하위클래스는 상위 클래스 참조불가
		
		//상위클래스는 하위클래스 자원 접근 불가
		//하위클래스는 상위클래스 자원 접근 가능
		//단, 하위클래스가 상위크ㅏㄹ래스 지원(메소드)는 재정의하면 그 때는 가능

		// 상위 클래스는 하위 클래스 참조 가능
		// 다단계 상속
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();

		// B b1 = new A(); 하위클래스는 상위 클래스 참조불가 이건 불가능
		// B b1 = (B)new A();이건 가능

		B b2 = new B();
		B b3 = new C();

		// C c1 = new A(); X
		// C c2 = new B(); X
		// C c1 = (C) new A();
		// C c2 = (C) new B();
		C c3 = new C(); // O

		// 강제 타입변환
		A aa1 = new B();
		// B bb2 = aa1; X
		B bb2 = (B) aa1;

		A aa2 = new C();

		C cc1 = (C) aa2;

		testFunc(new A());
		testFunc(new B());
		testFunc(new C());

//		a1.funD();
//		a2.funD();
//		a3.funD();

	}

}
