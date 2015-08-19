//worst-time-complexity O(n	2)
//best-case-time-complexity O(n)
public class InsertionSort {
	public static void insSort(int ar[]){
		for(int i=1;i<ar.length;i++){
			int element=ar[i];
			int j=i;
			while(j>0 && ar[j-1]>element){
				ar[j]=ar[j-1];
				j--;
			}
			ar[j]=element;
		}
		
	}

	public static void main(String[] args) {
				int arr[]={9,8,4,7,6,1};
		insSort(arr);
		for(int l=0;l<arr.length;l++)
			System.out.println(arr[l]);

	}

}
