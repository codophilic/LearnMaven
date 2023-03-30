package Unit.test;

public class pojo {
	public static void main(String args[]) {
		
		System.out.println("Sum of %d and %d is %d".formatted(5,10,Addition(5,10)));
		
	}
	
	public static int Addition(final int n1,final int n2) { return n1+n2;}
}
