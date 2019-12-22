package sort;

public class ShellSort {

	public static void sort(long[] arr){
		//计算最大间隔
		int h=1;
		while(h<arr.length/3){
			h=h*3+1;
		}
		while(h>0){
			//进行插入排序,间隔为h
			long temp=0;
			for(int i=1;i<arr.length;i++){
				temp=arr[i];
				int j=i-h;
				while(j>=0 && arr[j]>=temp){
					arr[j+h]=arr[j];
					j-=h;
				}
				arr[j+h]=temp;
			}
			
			//减小间隔
			h=(h-1)/3;
		}
	}
}
