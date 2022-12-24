package WebSales;

public class Extensions {
	// Function to add x in arr
	public static int[] append(int arr[], int x)
	{
		int n = arr.length;
		// create a new array of size n+1
		int newarr[] = new int[n + 1];

		for (int i = 0; i < n; i++)
			newarr[i] = arr[i];
   
		newarr[n] = x;
   
		return newarr;
   }
}
