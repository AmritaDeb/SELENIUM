package automation2;

public class B {

	public static void main(String[] args){
		A a1 = new A(4);
		int v = a1.getValue();
		System.out.println(v);
		//System.out.println(a1.i);		// i is declared as private
	}
}
