public class Swapping {

	public static void main(String[] args) {
		int a=30, b=40;
		
		System.out.println("before.." +a+" "+b);
		int temp=0;
		temp=a;
		a=b;
	    b=temp;
		System.out.println("after.." +a+" "+b);
		temp=a+b;
		System.out.println("before swaping values"+temp);
			}

}