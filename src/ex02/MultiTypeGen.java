package ex02;

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		
		return left + " 홈 " + right;
	}
	
}

public class MultiTypeGen {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("apple", 10);
		System.out.println(box);
		
	}

}