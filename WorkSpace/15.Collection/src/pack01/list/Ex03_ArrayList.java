package pack01.list;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		ArrayList<DepartmentDTO> list = new ArrayList<>();
//		DepartmentDTO dto = new DepartmentDTO(1, 2, 3, "asd");
//		list.add(dto);
		list.add(new DepartmentDTO(10, 10, 1000, "name1"));// 객체를 더함
		list.add(new DepartmentDTO(20, 12, 1200, "name2"));
		list.add(new DepartmentDTO(30, 13, 1300, "name3"));
		list.add(new DepartmentDTO(40, 14, 1400, "name4"));
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));//주소 출력
			System.out.println(list.get(i).getDepartmentName());
		}
	}
}
