package bitwise;

public class Bitwise{
    //判断奇偶数
    public String judge(int n){
        String res=new String();
        if((n&1)==1){
            res="奇数";
        }else{
            res="偶数";
        }
        return res;
    }
  	//交换两个数,不使用额外的变量
    public void swap(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
    }
    //找出没重复的数。一组数中除了一个数外其他数都出现了两次，找出这个没有重复的数。
    //一般思路使用哈希表来存储数组中的数和出现次数，再遍历哈希表找出现1个的数。时间复杂度O(n),空间复杂度O(n)。
    //使用异或的特点可以简化该问题，两个相同的数异或得到0，一个数与0异或得到它自身。时间复杂度O(n),空间复杂度O(1)。
    public int findNoRepeat(int[] arr){
        int tmp=arr[0];
        for(int i=1;i<arr.length;i++){
            tmp=tmp^arr[i];
        }
        return tmp;
    }
    //求m的n次方。一般思路连乘，时间复杂度O(n)。使用&1和>>1逐位读取n的值，并依次乘m，m的平方，m的四次方。
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
    //找出不大于n的最大的2的幂指数。传统做法用1不断乘2直到找到，时间复杂度O(logn)。
    //以21为例，用二进制数表示最后八位为00010101，只需找到最左边的1的位置即可。
   	//1.将n右移并与n做或运算，多次之后得到00011111。（整型的数一般32位，依次右移1,2,4,8,16即可）。
    //2.对该数+1再右移一位即可得到00010000，即16。
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

