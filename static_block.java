package class5;

public class static_block {
	static int a=10;
	int b;
	
	static {
		a=20;
		System.out.print("Hello world" + a );
	}
	
	public static void main(String[] args) {
		
		static_block s1=new static_block(); //not necessary it just a constructor.
	}

}
