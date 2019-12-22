package offer;

import java.util.HashMap;

public class PokerSequence {

	public static String pokerStrategy(String seqMei,String seqBai){
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<seqBai.length();i++){
			map.put(seqBai.charAt(i)-'0', i);
		}
		char[] cs=seqMei.toCharArray();
		int [] intMei=new int[cs.length];
		for(int i=0;i<cs.length;i++){
			intMei[i]=cs[i]-'0';
		}
		StringBuffer strategy=new StringBuffer();
		StringBuffer newSeqMei=new StringBuffer();
		int start=0,end=0;
		for(int i=0;i<intMei.length;i++){
			if(!map.containsKey(intMei[i])){
				strategy.append('d');
			}else{
				if(start==0){
					strategy.append('l');
					newSeqMei.insert(0, intMei[i]);
					start=intMei[i];
					end=intMei[i];
				}else if(map.get(intMei[i])<map.get(end) && map.get(intMei[i])>map.get(start)){
					strategy.append('d');
				}else if(map.get(intMei[i])>map.get(end)){
					strategy.append('r');
					newSeqMei.append(intMei[i]);
					end=intMei[i];
				}else {
					strategy.append('l');
					newSeqMei.insert(0, intMei[i]);
					start=intMei[i];
				}
			}
		}
		System.out.println(newSeqMei);
		System.out.println(strategy);
		if(!((newSeqMei.toString()).equals(seqBai))){
			return  "()";
		}
		//找到第一个l
		int firstL=0;
		for(int i=0;i<strategy.length();i++){
			if(strategy.charAt(i)=='l'){
				firstL=i;
				break;
			}
		}
		String res="(\n"+strategy.toString()+"\n";
		res+=strategy.replace(firstL, firstL+1, "r").toString()+"\n)";
		return res;
	}
	
	public static void main(String[] args) {
		String seqMei="45";
		String seqBai="67";
		System.out.println(pokerStrategy(seqMei,seqBai));
		
		int a=72;
		char b=(char)a;
		
		System.out.println(b);
	}
}
