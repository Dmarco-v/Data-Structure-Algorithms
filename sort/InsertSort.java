package sort;

public class InsertSort {

	public static void sort(long[] arr){
		long temp=0;
		
		for(int i=1;i<arr.length;i++){		//从第2位开始遍历到最后
			temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>=temp){ 	//寻找第i位的数字应该插入的位置
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
