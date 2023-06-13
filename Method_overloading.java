package sample;

public class Method_overloading 
{
static void ver1(int a)
{System.out.println(a);

	
}
static void ver1(int a, int b)
{
	int sub=a-b;
	System.out.println(sub);
}
static void ver1(int a, int b , int c)
{
	int add=a+ b + c;
	System.out.println(add);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ver1(10);
ver1(10 ,5);
ver1(2,2,2);
	}

}
