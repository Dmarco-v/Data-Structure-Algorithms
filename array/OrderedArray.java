package array;

public class OrderedArray {
	
	private int [] ordArray;
	private int length;
	
	//构造方法，传入数组长度
		public OrderedArray (int max){
			length=max;
			ordArray=new int[length];
		}
	
	//查找方法，查找该数字在有序数组中的下标，二分查找，复杂度O(logN)，循环（非递归）方式实现
	public int find(int target){
		int lb=0;			//区间下限
		int ub=length-1;	//区间上限
		int mean;			//区间中点
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
	
	//查找方法，二分查找，递归实现
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
	
	//插入方法。
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
	
	
	
	//删除方法。
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
	
	//列出元素
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
