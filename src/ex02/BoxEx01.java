package ex02;

class Box<T>{
	
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
	
}


public class BoxEx01 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(123);
		int num = iBox.get();
		System.out.println(num);

		Box<Double> dBox = new Box<Double>();
		dBox.set(123.0);
		double dNum = dBox.get();
		System.out.println(dNum);
	}

}
