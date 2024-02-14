package ex08;

class Box<T> {
	protected T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		obj = o;
	}
}

public class GenericMehthod01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new SteelBox(1234);
		Box<String> sbox = new SteelBox("korea");
		
		System.out.println(ibox.get());
		System.out.println(sbox.get());


	}

}
