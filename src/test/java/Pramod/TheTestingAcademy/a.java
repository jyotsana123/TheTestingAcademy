package Pramod.TheTestingAcademy;


interface a1{
	void m1();
	
	a2 m2();
	
	interface a2{
		void m3();
	}
	
}

public class a implements a1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a test = new a();
		a1.a2 jbb = test.m2();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public a2 m2() {
		// TODO Auto-generated method stub
		return new b();
	}


}
