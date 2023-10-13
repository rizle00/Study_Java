package pack02.product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getNum() + ". " + dto.getName() + ":" + dto.getPrice() + "원");

	}

	public void display(ProductDTO[] dtos) { // 오버로딩
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}
	// CRUD: 자료 조회, 추가, 수정, 삭제
	// 아직 데이터 베이스 연동이 없기 때문에 수동으로 데이터를 넣어줌

	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[5];
		dtos[0] = new ProductDTO(1, 6900, "스카프");
		dtos[1] = new ProductDTO(2, 4900, "스카프1");
		dtos[2] = new ProductDTO(3, 5900, "스카프2");
		dtos[3] = new ProductDTO(4, 5900, "스카프2");
		dtos[4] = new ProductDTO(5, 5900, "스카프2");
		return dtos;
	}

	// CRU "D"
	// 사용자가 어떤 상품을 삭제할지 선택. -> 해당하는 DTO 가 삭제됨
	public ProductDTO[] delete(ProductDTO[] dtos) {
//		while(!userInput()) {
//			System.out.println("입력 다시하나?");
//		}
//		System.out.println("???");
		int choice = userInputNum("삭제 상품 번호 입력!")-1;
		if(choice < dtos.length) {
			dtos[choice] = null;
			ProductDTO[] tempDtos = new ProductDTO[dtos.length-1];
			// forEach : 향상된 for문
			int idx = 0;
			for (ProductDTO dto : dtos) {
				if (dto != null) {
					tempDtos[idx] = dto;
					idx++;
				}
			}
			// dtos =tempDtos;
			return tempDtos;
			
		} else {
			System.out.println("해당하는 상품 없음");
			return dtos;
		}
		
		
		// display(tempDtos);
//		for (int i=0; i<dtos.length; i++) {
//			tempDtos[i] = dtos[i];  null 이 있어서 모든 자료 넣기 불가
//		}
		// dtos = new ProductDTO[4]; // 기존x
		// display(dtos);
	}
	
	
	public int userInputNum(String msg) {
		System.out.println(msg);
		Scanner scan = new Scanner(System.in);
		while(true) {
		try {
		int inputNum = Integer.parseInt(scan.nextLine());// 오류 발생 코드 감지 -> 예외 처리
		 return inputNum;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("오류 발생 -> 숫자만 입력");
		} finally {
			//scan.close();//통신종료
		} 
		}
	}
	public void find() {
		String str = new String("s:T:r 객체");
		//문자열의 길이 : 몇 글자 이상 입력을 받아야 할때
		System.out.println(str.length());
		// 문자열의 시작 값 : startsWith,
		System.out.println(str.startsWith("s"));
		System.out.println(str.startsWith("a"));
		// 내가 찾는 글자가 몇번째에 있는지 (index) 체크
		System.out.println(str.indexOf("r"));
		
		//원하는 문자를 바꾸기. s:t:r -> str (치환) replace
		System.out.println(str.replace(':', ' '));
		//문자열을 특정 구분자로 잘라서 배열 형태로 나누어 담음
		String[] strs = str.split(":");
		System.out.println(Arrays.toString(strs));
		// 대문자 변환, 소문자 변환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//trim() 공백 제거 -> DB 에서
		System.out.println(str.trim());
		//subString ( 문자열 자르기) : indexof
		System.out.println(str.substring(4));
		System.out.println(str.substring(4, str.indexOf('r')));
		//문자열의 특정값 포함여부 boolean 리턴
		System.out.println(str.contains("객체"));
		System.out.println(str.contains("aaa"));
	}
}