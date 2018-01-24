package class5;

public class overloadding {
	
	void print() {
		System.out.println("hello");
	}
	void print(int i) {
		System.out.println("hello"+i);
	}
	void print(float f) {
		System.out.println("hello" +f);
	}
		
		public static void main(String[] args) {
			overloadding over=new overloadding();
			
			over.print();
			over.print(67);
			over.print(44.4f);
			
			
		}
		

}
