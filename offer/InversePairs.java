package offer;

public class InversePairs {
	public int inversePairs(int [] array) {
        if(array.length==0) return 0;
        int [] help=new int[array.length];
        for(int i=0;i<array.length;i++){
            help[i]=array[i];
        }
        return mergeCount(array,help,0,array.length-1);
    }
	private int mergeCount(int [] array,int [] help,int start,int end){
        
    	if(start==end) return 0;
        int mid=(start+end)>>1;
        int leftCount=mergeCount(array,help,start,mid)%1000000007;
        int rightCount=mergeCount(array,help,mid+1,end)%1000000007;
        int count=0;
        int i=start,j=mid+1;//左右子数组的指针
        int k=start;//辅助数组的指针
        while(i<=mid && j<=end){
            if(array[i]>array[j]){
                count+=mid+1-i;
                help[k++]=array[j++];
                if(count>=1000000007){
                    count%=1000000007;
                }
               
            }else{
                help[k++]=array[i++];
            }
        }
        while(i<=mid){
            help[k++]=array[i++];
        }
        while(j<=end){
            help[k++]=array[j++];
        }
        for(int s=start;s<=end;s++){
            array[s]=help[s];
        }
        return (count+leftCount+rightCount)%1000000007;
    }
    public static void main(String[] args)  {
		InversePairs inversePairs=new InversePairs();
		int [] array=new int[]{2,3,4,2,1,3};
		System.out.println(inversePairs.inversePairs(array));
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		String string="ada";
		System.out.println(string.substring(1));
	}
}