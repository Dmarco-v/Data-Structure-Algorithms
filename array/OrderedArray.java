package array;

public class OrderedArray {
	
	private int [] ordArray;
	private int length;
	
	//���췽�����������鳤��
		public OrderedArray (int max){
			length=max;
			ordArray=new int[length];
		}
	
	//���ҷ��������Ҹ����������������е��±꣬���ֲ��ң����Ӷ�O(logN)��ѭ�����ǵݹ飩��ʽʵ��
	public int find(int target){
		int lb=0;			//��������
		int ub=length-1;	//��������
		int mean;			//�����е�
		int index=-1;
		while (lb<=ub){
			mean=(lb+ub)/2;
			if(target==ordArray[mean]){
				index=mean;
				break;
			}else if(target>ordArray[mean]){
				lb=mean+1;
			}else{
				ub=mean-1;
			}
		}
		return index;
	}
	
	//���ҷ��������ֲ��ң��ݹ�ʵ��
	public int find(int [] arr,int lb,int ub,int target){
		int mean=(lb+ub)/2;
		if(lb>ub){
			return -1;
		}
		if(target==arr[mean]){
			return mean;
		}else if(target>arr[mean]){
			return find(arr,mean+1,ub,target);
		}else return find (arr,lb,mean-1,target);
	}
	public int findRes(int target){
		int lb=0;
		int ub=length-1;
		int[]arr=ordArray;
		return find(arr,lb,ub,target);
	}
	
	//���뷽����
	public void insert(int num){
		length++;
		int []temp=new int[length];
		for(int i=0;i<length-1;i++){
			temp[i]=ordArray[i];
		}
		temp[length-1]=num;
		ordArray=new int[length];
		for(int i=0;i<length;i++){
			ordArray[i]=temp[i];
		}
		for(int i=length-1;i>0;i--){
			if(ordArray[i]<ordArray[i-1]){
				int a=ordArray[i];
				ordArray[i]=ordArray[i-1];
				ordArray[i-1]=a;
			}
		}
	}
	
	
	
	//ɾ��������
	public boolean delete(int target){
		int index=-1;
		for(int i=0;i<length;i++){
			if(ordArray[i]==target){
				index=i;
				break;
			}
		}
		if(index==-1){
			return false;
		}else{
			length=length-1;
			for(int i=index;i<length;i++){
				ordArray[i]=ordArray[i+1];
			}
			return true;
		}
	}
	
	//�г�Ԫ��
	public void display(){
		for(int i=0;i<length;i++){
			System.out.print(ordArray[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		OrderedArray ord=new OrderedArray(11);
		for (int i=0;i<ord.length;i++){
			ord.ordArray[i]=2*i;
		}
		ord.display();
		System.out.println(ord.findRes(6));
		System.out.println(ord.delete(12));
		ord.display();
		ord.insert(13);
		ord.display();
		
	}
}
