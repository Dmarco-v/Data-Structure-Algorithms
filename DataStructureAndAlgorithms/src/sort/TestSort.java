package sort;

public class TestSort {

	public static void main(String[] args) {
		
		long[] arr=new long[10];
		for(int i=0;i<10;i++){
			arr[i]=(long) (Math.random()*100);
		}
		TestSort.display(arr);
		BubbleSort.sort(arr);
		//SelectionSort.sort(arr);
		//InsertSort.sort(arr);
		//ShellSort.sort(arr);
		//QuickSort.sort(arr);
		TestSort.display(arr);
	}
	
	public static void display(long[] arr){
		for(long num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
