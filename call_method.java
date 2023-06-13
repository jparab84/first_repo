package sample;

public class call_method {

	int a =10;
	static void m1()
	{
		call_method obj= new call_method();
		System.out.println(obj.a);
		
		
	}
	

	public static void main(String[] args) {
		m1();
	}
}