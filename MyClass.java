public class MyClass {

	private int a = 10;
	private int b = 0;

	//setting b value
	public void setb(int value) {
	//	value = 100;
		this.b = value;
	}

	public void printOut(MyClass that) {
		System.out.println(that.b);
	}

	public static void main(String[] args) {
		MyClass one = new MyClass();
		MyClass two = new MyClass();
		one.setb(20);
		one.printOut(two);
	}
}
