package sort;

public class MergeSort {

	private int [] array;  //�����������
	  
	   public MergeSort(int [] array){
	       this.array= array;
	   }
	  
	   //��˳���ӡ�����е�Ԫ��
	   public void display(){
	       for(int i=0;i<array.length;i++){
	          System.out.print(array[i]+"\t");
	       }
	       System.out.println();
	   }
	 
	   //�鲢����
	   public void mergeSort(){
	      
	       int[] workSpace = new int [array.length]; //���ڸ������������
	       recursiveMergeSort(workSpace,0,workSpace.length-1);
	   }
	  
	   /**
	    * �ݹ�Ĺ鲢����
	    * @param workSpace  �������������
	    * @param lowerBound ���鲢����ε���С�±�
	    * @param upperBound ���鲢����ε�����±�
	    */
	   private void recursiveMergeSort(int [] workSpace,int lowerBound,int upperBound){
	      
	       if(lowerBound== upperBound){  //�ö�ֻ��һ��Ԫ�أ���������
	          return;
	       }else{
	          int mid = (lowerBound+upperBound)/2;
	          recursiveMergeSort(workSpace,lowerBound,mid);    
	          recursiveMergeSort(workSpace,mid+1,upperBound);  
	          merge(workSpace,lowerBound,mid,upperBound);
	          display(); 
	       }
	   }
	 
	   /**
	    * ������array�е����ν��кϲ���lowerBound~midΪ��λ�Σ�mid+1~upperBoundΪ��λ��
	    * @param workSpace �����鲢�����飬���ɹ鲢���Ԫ��
	    * @param lowerBound �ϲ��ε���ʼ�±�
	    * @param mid �ϲ��ε��е��±�
	    * @param upperBound �ϲ��εĽ����±�
	    */
	   private void merge(int [] workSpace,int lowerBound,int mid,int upperBound){
	      
	       int lowBegin = lowerBound;  //��λ�ε���ʼ�±�
	       int lowEnd = mid;           //��λ�εĽ����±�
	       int highBegin = mid+1;  //��λ�ε���ʼ�±�
	       int highEnd = upperBound;  //��λ�εĽ����±�
	       int j = 0; //workSpace���±�ָ��
	       int n = upperBound-lowerBound+1;  //�鲢��Ԫ������
	      
	       while(lowBegin<=lowEnd && highBegin<=highEnd){ 
	          if(array[lowBegin]<array[highBegin]){//�����߽�С���Ǹ��ŵ�workSpace��
	              workSpace[j++]= array[lowBegin++]; 
	          }else{
	              workSpace[j++]= array[highBegin++]; 
	          }
	       } 
	      
	       while(lowBegin<=lowEnd){ 
	          workSpace[j++]= array[lowBegin++]; 
	       }
	      
	       while(highBegin<=highEnd){ 
	          workSpace[j++]= array[highBegin++]; 
	       }
	      
	       for(j=0;j<n;j++){  //���鲢�õ�Ԫ�ظ��Ƶ�array��
	          array[lowerBound++]= workSpace[j];
	       }
	      
	   }
	  

	
}
