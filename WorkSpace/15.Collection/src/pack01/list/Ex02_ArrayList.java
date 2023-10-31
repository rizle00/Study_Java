package pack01.list;

import java.util.ArrayList;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<>();
		boolean isAdd = iList.add(1);//iList.
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.add(5);
		iList.remove(0);// 인덱스 자체 삭제
		iList.add(0, 7);// 인덱스 끼워넣기
		
		System.out.println(iList.get(0)+""+isAdd);
		System.out.println(iList.contains(1)+" 1 is exist"); 
		System.out.println(iList.contains(6)+" 6 is not exist"); 
//		iList.clear(); // 인덱스 요소 비우기
		System.out.println(iList.isEmpty()+"  isEmpty 비어있는지 확인 null x");
		
	}
}
