package offer;

import java.util.Scanner;

public class Main {

	/**
	 * ��Ϲ�֭��������
	 * @param n ��������
	 * @param w ���е�ÿ����������
	 * @param v ��ÿ�����������Ǯ
	 * @param m ��Ԥ��
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
	 * �ַ����������⡣������a�е����֣�1-n��ɾ��s1�ж�Ӧλ�õ��ַ���Ҫ����s1ʼ�հ���s2����������ɾ����
	 * @param s1
	 * @param s2
	 * @param a
	 * @return
	 */
	public int strContains(String s1,String s2,int[] a){
		int count=0;
		//д������s2���ַ�����ʽ
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
/* 		//��Ϲ�֭
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
		
		//�ַ�������
		String s1=new String("ygttygt");
		String s2=new String("ygt");
		int [] a=new int[]{5,3,4,1,7,6,2};
		System.out.println(res.strContains(s1,s2,a));
	}
}
