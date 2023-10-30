package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		String [] strs = {"A","B","C","D","E"};
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		String [] adds = new String [strs.length+1];
		
		for (int j = 0; j < strs.length; j++) {
			adds[j] = strs[j];
		} adds[adds.length-1] = "F";
		
		System.out.println(Arrays.toString(adds));
		//배열은 사이즈를 미리 지정 후 변경이 불가능 -> 데이터 추가 &삭제 시 불편한 점이 많음
		// List -> Interface
		//List<E> E -> Element(요소) extends Object (객체 형태로 초기화 가능)
		List<String> list = new ArrayList<>();
		list.add("A"); //=> add : 데이터를 추가 하면서 크기가 증가함(index)
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println("리스트 크기"+list.size());
		System.out.println("리스트[0]"+list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
//		for(String add : strs) {
//			adds[i] = strs[i];
//		}
	}
}
