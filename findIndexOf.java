package sample;

public class findIndexOf

{
	static int findIndex(int[] a, int t)
	{
		if(a==null)
		{
		return -1;
		}
	int len;
	len=a.length;
	int i = 0 ;
	while (i<len)
	{
	 if(a[i]==t)
	 {
		 return i;
	 }
	 else
		 i++;
	}
	return -1;
	}
	

	public static void main(String[] args) {
		
		int a[]= {2,1,3,5,6,};
		int t=5;
		System.out.println(findIndex(a, t));
	}
}