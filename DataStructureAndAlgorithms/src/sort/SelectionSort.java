package sort;

public class SelectionSort {

	public static void sort(long[] arr){
		int k=0;
		long temp=0;
		for(int i=0;i<arr.length-1;i++){ 		//外层循环
			k=i;
			for(int j=i;j<arr.length;j++){		//内层循环，寻找剩下数中最小值的脚标
				if(arr[j]<arr[k]){
					k=j;
				}
			}
			temp=arr[k];						//交换最小值和arr[i]
			arr[k]=arr[i];
			arr[i]=temp;
		}
	}
}
