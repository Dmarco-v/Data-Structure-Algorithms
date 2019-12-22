package array;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		list.remove(4);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+""+i);
		}
		
		
	}
}
