package bitwise;

public class Bitwise{
    //�ж���ż��
    public String judge(int n){
        String res=new String();
        if((n&1)==1){
            res="����";
        }else{
            res="ż��";
        }
        return res;
    }
  	//����������,��ʹ�ö���ı���
    public void swap(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
    }
    //�ҳ�û�ظ�������һ�����г���һ�����������������������Σ��ҳ����û���ظ�������
    //һ��˼·ʹ�ù�ϣ�����洢�����е����ͳ��ִ������ٱ�����ϣ���ҳ���1��������ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n)��
    //ʹ�������ص���Լ򻯸����⣬������ͬ�������õ�0��һ������0���õ�������ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(1)��
    public int findNoRepeat(int[] arr){
        int tmp=arr[0];
        for(int i=1;i<arr.length;i++){
            tmp=tmp^arr[i];
        }
        return tmp;
    }
    //��m��n�η���һ��˼·���ˣ�ʱ�临�Ӷ�O(n)��ʹ��&1��>>1��λ��ȡn��ֵ�������γ�m��m��ƽ����m���Ĵη���
    public int pow(int m,int n){
        int res=1;
        int tmp=m;
        while(n!=0){
            if((n&1)==1){
                res*=tmp;
            }
            tmp*=tmp;
            n=n>>1;
        }
        return res;
    }
    //�ҳ�������n������2����ָ������ͳ������1���ϳ�2ֱ���ҵ���ʱ�临�Ӷ�O(logn)��
    //��21Ϊ�����ö���������ʾ����λΪ00010101��ֻ���ҵ�����ߵ�1��λ�ü��ɡ�
   	//1.��n���Ʋ���n�������㣬���֮��õ�00011111�������͵���һ��32λ����������1,2,4,8,16���ɣ���
    //2.�Ը���+1������һλ���ɵõ�00010000����16��
    public int findN(int n){
        n|=n>>1;
        n|=n>>2;
        n|=n>>4;
        n|=n>>8;
        n|=n>>16;
        return (n+1)>>1;
    }
    
    public static void main(String[] args) {
		//testJudge
    	Bitwise bitwise=new Bitwise();
    	System.out.println(bitwise.judge(3));
    	//testSwap
    	int x=3;
    	int y=4;
    	bitwise.swap(x, y);
    	System.out.println("x="+x+" y="+y);
    	//testFind
    	int [] arr=new int[]{1,2,2,3,3,7,1};
    	int res1=bitwise.findNoRepeat(arr);
    	System.out.println(res1);
    	//testPow
    	System.out.println(bitwise.pow(10, 5));
    	//testFindN
    	System.out.println(bitwise.findN(90));
	}
}

