package offer;

import java.util.HashMap;

//找到字符串中最多的子串
public class FindMostSubString {

	public static String findMostSubString(String str){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				
				if(str.substring(0, i).contains(str.substring(i,j)) ||str.substring(j, str.length()).contains(str.substring(i,j)) ){
					int count=0;
					int len=j-i;
					for(int k=0;k<str.length()-len;k++){
						if(str.substring(k, k+len).equals(str.substring(i, j))){
							count++;
						}
					}
					
					if(count!=0){
						map.put(str.substring(i,j), count);
					}
					
				}
				
			}
		}
		int max=0;
		String res=new String();
		for(String s:map.keySet()){
			if(map.get(s)>=max && s.length()>res.length()){
				max=map.get(s);
				res=s;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String string="abcdfabcabcg";
		System.out.println(findMostSubString(string));

	}
}
