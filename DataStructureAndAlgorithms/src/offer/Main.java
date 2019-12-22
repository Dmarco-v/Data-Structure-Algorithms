package offer;

import java.util.Scanner;

public class Main {

	/**
	 * 混合果汁调配问题
	 * @param n 配料种类
	 * @param w 已有的每种配料数量
	 * @param v 买每种配料所需的钱
	 * @param m 总预算
	 * @return
	 */
	public int juice(int n,int[] w,int[] v,int m){
		int amount=0;
		int cost=0;
		int wMin=w[0];
		for(int i=0;i<n;i++){
			if(w[i]<wMin) {
				wMin=w[i];
			}
		}
		for(int i=0;i<n;i++){
			w[i]-=wMin;
		}
		amount=wMin;
		while(cost<=m){
			for(int i=0;i<n;i++){
				w[i]-=1;
				if(w[i]<0){
					cost+=v[i];
				}
			}
			amount++;
		}
		return amount-1;
	}
	
	/**
	 * 字符串包含问题。按数组a中的数字（1-n）删除s1中对应位置的字符，要保持s1始终包含s2，问最多可以删几个
	 * @param s1
	 * @param s2
	 * @param a
	 * @return
	 */
	public int strContains(String s1,String s2,int[] a){
		int count=0;
		//写出包含s2的字符串样式
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<s2.length();i++){
			stringBuffer.append(s2.charAt(i));
			stringBuffer.append(".*");
		}
		StringBuffer stringBuffer1=new StringBuffer(s1);
		for(int i=0;i<a.length;i++){
			stringBuffer1.replace(a[i]-1, a[i], " ");
			System.out.println(stringBuffer1);
			if(stringBuffer1.toString().matches(stringBuffer.toString())){
				count++;
			}else break;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
 		Main res=new Main();
/* 		//混合果汁
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int []w=new int [n];
			int []v=new int [n];
			for(int i=0;i<n;i++){
				w[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				v[i]=sc.nextInt();
			}
			System.out.println(res.juice(n,w,v,m));
		}
		sc.close();*/
		
		//字符串包含
		String s1=new String("ygttygt");
		String s2=new String("ygt");
		int [] a=new int[]{5,3,4,1,7,6,2};
		System.out.println(res.strContains(s1,s2,a));
	}
}
