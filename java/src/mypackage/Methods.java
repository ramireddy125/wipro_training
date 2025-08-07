package mypackage;
import java.util.*;

public class Methods {
	static int a=10;
	static char c='p';
    String b="venkat";
    float m;
    double d;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se = new Scanner(System.in);
		System.out.println(a);
		System.out.println(c);
		m1();
		Methods obj1 = new Methods();	
		obj1.m2(se.next(),se.nextInt(),se.nextFloat() );
		System.out.println(obj1.m3(true));
		System.out.println(m4(5562566l));
		
		
//		Methods obj = new Methods();
//		System.out.println(obj.b);

	}
	static void m1() {
		Methods obj = new Methods();
		
		System.out.println(obj.b);
		obj.m=9.8f;
		obj.d=99.99;
		System.out.println(obj.m);
		System.out.println(obj.d);
	}
	void m2( String s, int e, float f) {
		System.out.println(s);
		System.out.println(e);
		System.out.println(f);
	}
	String m3(boolean ba) {
		System.out.println(ba);
		return "venkat";
	}
	static char m4(long l) {
		System.out.println(l);
		return 'c';
	}

}
