package sort;

public class QuickSort {

	public static void sort(long[]arr){
		int left=0;
		int right=arr.length-1;
		sort(arr,left,right);
	}
	
	private static void sort(long[] arr,int left,int right){
		if(left>=right){
			return;
		}
		long point=arr[right];
		int partition=partition(arr, left, right, point);
		//对左边进行快排
		sort(arr, left, partition-1);
		//对右边进行快排
		sort(arr, partition+1, right);
	}
	
	/**
	 * 划分数组
	 */
	public static int partition(long[] arr,int left,int right,long point){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			//将比关键字小的留在左边
			while(leftPtr<rightPtr && arr[leftPtr]<point){
				leftPtr++;
			}
			//将比关键字大的留在右边
			while(rightPtr>leftPtr && arr[rightPtr]>point){
				rightPtr--;
			}
			if(leftPtr>=rightPtr){
				break;
			}else{
				long temp= arr[leftPtr];
				arr[leftPtr]=arr[rightPtr];
				arr[rightPtr]=temp;
			}
		}
		//将关键字（最后一个数）与分界处的数进行交换
		long temp= arr[leftPtr];
		arr[leftPtr]=arr[right];
		arr[right]=temp;
		return leftPtr;//返回划分点
	}
	

	
	

	
}
