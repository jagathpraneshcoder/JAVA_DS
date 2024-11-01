import java.util.*;
//Find the minimum and the swap

class  SelectionSort{

	static void selectionSort(int[] arr){
		//initially start with 0 to n-2th element because we dont need to check n-1th element as we already sorted at n-2th eleemnt
		int n=arr.length;
		for(int i=0;i<=n-2;i++){
			//after finishing ith iteration we can start from right unsorted and array leaving out left sorted array
			int minIndex = i;
			for(int j=i;j<=n-1;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			//After Finding least element swap out the element
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}

	static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		selectionSort(arr);
		display(arr);
	}
}

//System.out.println();
