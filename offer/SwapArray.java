package offer;

public class SwapArray {

	
    public void reOrderArray(int [] array) {
        if(array.length>0) {
        	for(int i=0;i<array.length-1;i++){
                for(int j=array.length-1;j>i;j--){
                	//前偶后奇就交换
                    if( ((array[j]&1)==1) && ((array[j-1]&1)==0)){
                    	array[j]=array[j]^array[j-1];
                    	array[j-1]=array[j]^array[j-1];
                    	array[j]=array[j]^array[j-1];
                    }
                }
            }
        }
    	
    }
    /*public void swap(int x,int y){
        int tmp=y;
        y=x;
        x=tmp;
    }*/
    public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5};
		SwapArray swapArray=new SwapArray();
		swapArray.reOrderArray(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}

}
