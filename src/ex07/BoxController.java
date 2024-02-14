package ex07;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}

	@Override
	public String toString() {
		return obj.toString();
	}

}

class Unboxer{
	public static <T> void openBox(Box<T> box) {
		System.out.println(box);
	}
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class BoxController {

	public static void main(String[] args) {

		Box<String> sbox = new Box();
		sbox.set("korea");
		
		Unboxer.peekBox(sbox);
	}

}
