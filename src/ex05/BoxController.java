package ex05;

class Box<T> {
	private Integer obj;

	void set(Integer obj) {
		this.obj = obj;
	}

	Integer get() {
		return this.obj;
	}
}

class BoxFactory {

	public static <T> Box<Integer> makeBox(Integer o) {
		Box<Integer> box = new Box<Integer>();
		box.set(o);
		return box;
	}

	Box<Integer> iBox = BoxFactory.makeBox(100);
}
public class BoxController {

	public static void main(String[] args) {
		System.out.println();
	}

}
