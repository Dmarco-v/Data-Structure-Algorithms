package array;

/**
 * ��������
 * @author dmarco
 *
 */
public class Array {
	
	private String [] strArray;
	private int length=0;
	
	//���췽�����������鳤��
	public Array (int max){
		length=max;
		strArray=new String[length];
		
	}
	
	//���ҷ�������������򷵻��±ꣻ�������򷵻�-1�����Ӷ�O(N)
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
	
	//���뷽�������δ�������Ӷ�O(1)��������������������Ƶ��µĿռ䣬���Ӷ�O(N)
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
	
	//ɾ��������ɾ��ָ��Ԫ�أ������Ƿ�ɹ������Ӷ�O(N)
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
	
	//�г�Ԫ��
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
