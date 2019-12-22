package offer;

import java.util.PriorityQueue;
import java.util.Comparator;


public class GetMedianNumber {


	
    //Ð¡¶¥¶Ñ
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //´ó¶¥¶Ñ
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);//
        }
    });
    public void Insert(Integer num) {
        
    }
    public Double GetMedian() {
    	
    	return 0.0;
    }
	
    public static void main(String[] args) {
    	String string="";
    	String string2="";
    	System.out.println(string==string2);
	}
}
