package sort;

public class BubbleSort {
	
	public static void sort(long[] arr){
		long temp=0;
		for(int i=0;i<arr.length-1;i++){			//外层循环，从头到尾
			for(int j=arr.length-1;j>i;j--){	//内层循环，从末尾开始，两两比较，小的冒到前面，直至到i为止
				if(arr[j-1]>arr[j]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
}
