package ex04;

class Box<T>{
	private T obj;
	
	 void set(T obj) {
		 this.obj = obj;
	 }
	 T get() {
		 return obj;
	 }
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		Box<String> sbox = new Box<String>();
		sbox.set("korea");
		String str = Unboxer.openBox(sbox);
		
		System.out.println(str);
		
	}

}
