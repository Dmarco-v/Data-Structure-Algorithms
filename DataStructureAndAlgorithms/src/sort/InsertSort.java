package sort;

public class InsertSort {

	public static void sort(long[] arr){
		long temp=0;
		
		for(int i=1;i<arr.length;i++){		//�ӵ�2λ��ʼ���������
			temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>=temp){ 	//Ѱ�ҵ�iλ������Ӧ�ò����λ��
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
