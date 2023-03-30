package Addition;

public class Add {

	public static void main(String args[]) {
		
		System.out.println("Sum of %d and %d is %d".formatted(5,10,AddNum(5,10)));
		
	}
	
	public static int AddNum(final int n1,final int n2) { return n1+n2;}
}
