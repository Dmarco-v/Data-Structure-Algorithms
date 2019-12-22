package array;

/**
 * 无序数组
 * @author dmarco
 *
 */
public class Array {
	
	private String [] strArray;
	private int length=0;
	
	//构造方法，传入数组长度
	public Array (int max){
		length=max;
		strArray=new String[length];
		
	}
	
	//查找方法，如果存在则返回下标；不存在则返回-1。复杂度O(N)
	public int contains (String str){
		int index=-1;
		for(int i=0;i<length;i++){
			if(strArray[i].equals(str)){
				index=i;
				break;
			}
		}
		return index;
	}
	
	//插入方法。如果未满，复杂度O(1)，如果已满，数组整体移到新的空间，复杂度O(N)
	public void insert(String str){
		length=length+1;
		String [] temp=new String[length];
		for(int i=0;i<length-1;i++){
			temp[i]=strArray[i];
		}
		temp[length-1]=str;
		strArray=new String[length];
		for(int i=0;i<length;i++){
			strArray[i]=temp[i];
		}
	}
	
	//删除方法。删除指定元素，返回是否成功。复杂度O(N)
	public boolean delete(String str){
		int index=-1;
		for(int i=0;i<length;i++){
			if(strArray[i].equals(str)){
				index=i;
				break;
			}
		}
		if(index==-1){
			return false;
		}else{
			length=length-1;
			for(int i=index;i<length;i++){
				strArray[i]=strArray[i+1];
			}
			return true;
		}
	}
	
	//列出元素
	public void display(){
		for(int i=0;i<length;i++){
			System.out.print(strArray[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		Array arr=new Array(10);
		for(int i=0;i<arr.length;i++){
			arr.strArray[i]="A"+i;
		}
		arr.display();
		System.out.println(arr.contains("A5"));
		arr.insert("A100");
		arr.display();
		System.out.println(arr.delete("A6"));
		arr.display();
	}
	
}
