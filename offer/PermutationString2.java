package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class PermutationString2 {

	public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        if(str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            //��ʱ�õ���listδ���ֵ�������
            Collections.sort(list);
        }
        return list;
    }
    public void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        //�ݹ��յ㣬��iΪ�ַ������һ���ַ�ʱ�������ַ�����ӵ��б��У��������ݹ�
        if(i==chars.length-1){
            list.add(String.valueOf(chars));
        }
        else{
            Set<Character> charSet=new HashSet<Character>();
            //�̶���һ���ַ����ҳ�������ַ������������
            charSet.add(chars[i]);
            PermutationHelper(chars,i+1,list);
            //�������ַ�����δ���ֹ����ַ����������ַ�����
            for(int j=i+1;j<chars.length;j++){
            	if(!charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,i,j);
                }
            }
        }
    }
    public void swap(char[] chars,int i,int j){
        char tmp=chars[i];
        chars[i]=chars[j];
        chars[j]=tmp;
    }
    
    public static void main(String[] args) {
		PermutationString2 permutationString2=new PermutationString2();
    	System.out.println(permutationString2.Permutation("ddcxad"));
	}
}
