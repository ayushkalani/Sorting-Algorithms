//worst-case-time-complexity O(n2)
//	best-case-time-complexity O(n)
public class BubbleSort {
	public static void bubbleSort(int[] ar){
		int k=0;
		int flag;
		while(k<=ar.length-1){
			flag=0;
				for(int i=0;i<ar.length-1-k;i++){
						int j=i+1;
						if(ar[i]>ar[j]){
							//swaping of elements
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						flag++;
					}				
				}
		if(flag==0)
			break;
		k++; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,5,2,4,3,9};
		bubbleSort(arr);
		for(int l=0;l<arr.length;l++)
			System.out.println(arr[l]);

	}

}
