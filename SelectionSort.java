

//Worst-Case-Time-Complexity O(n2)
//Best-Case-Time-Complexity O(n2)
//Average Time Complexity O(n2)
public class SelectionSort {
	public static void selectionSort(int ar[]){
		for (int i = 0;i<ar.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j<ar.length; j++)
		            if (ar[j] <ar[min]) min = j;
		      int temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		}
		
	}

	public static void main(String[] args) {
	
		int arr[]={4,42,23,16,1,10};
		
		selectionSort(arr);
		 for(int p=0;p<arr.length;p++)
			 System.out.println(arr[p]);
		 }	
	}
	
	


