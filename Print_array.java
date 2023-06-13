package sample;

public class Print_array {

	public static void main(String[] args) {
	
	int [] arr= {1,2,4,5,8,9};
	/*int len=arr.length;
	int i=0;
	for (;i<len;i++)
	{
		System.out.print(" " +arr[i]);
	}
	*/
		
		
	for (int i : arr)
	{
		System.out.println(i);
	}
	}

	}
