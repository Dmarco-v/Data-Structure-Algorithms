package offer;

import java.util.Arrays;

public class XY {
	
	private static boolean compareXY(int x,int y){
		int a=Math.min(Math.abs(x),Math.abs(y));
		int b=Math.max(Math.abs(x),Math.abs(y));
		/*int c=Math.abs(x-y);
		int d=Math.abs(x+y);
		return Math.max(a, b)<=Math.max(c, d) && Math.min(a, b)>=Math.min(c, d);*/
		return b<=2*a;
	}
	public static int count(int[]nums){
		int count=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(compareXY(nums[i], nums[j])) {
					System.out.print(nums[i]+" ");
					System.out.println(nums[j]);

					count++; 
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count(new int[]{-8,-1,2,3,4,8}));
	}
}
