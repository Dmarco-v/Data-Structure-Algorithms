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
		//����߽��п���
		sort(arr, left, partition-1);
		//���ұ߽��п���
		sort(arr, partition+1, right);
	}
	
	/**
	 * ��������
	 */
	public static int partition(long[] arr,int left,int right,long point){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			//���ȹؼ���С���������
			while(leftPtr<rightPtr && arr[leftPtr]<point){
				leftPtr++;
			}
			//���ȹؼ��ִ�������ұ�
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
		//���ؼ��֣����һ��������ֽ紦�������н���
		long temp= arr[leftPtr];
		arr[leftPtr]=arr[right];
		arr[right]=temp;
		return leftPtr;//���ػ��ֵ�
	}
	

	
	

	
}
