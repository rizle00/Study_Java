package pack03.exArray2;

import java.util.Arrays;

public class Test02_Array {
public static void main(String[] args) {
	String [] dog = new String[4];
	
   dog[0] = "강아지";
   dog[1] = "진돗개";
   dog[2] = "불독";
   dog[3] = "시츄";
	String[] cat= {"페르시안", "고양이", "노르웨이"};
	String [][] anmails = {dog,cat};
	String [][] strArr = new String[2][];
	strArr[0]=dog;
	strArr[1]=cat;
	for(int i=0; i<strArr.length; i++) {
		for(int j=0; j<strArr[i].length; j++) {
			System.out.println(strArr[i][j]);
		}// java외에 없을 확률이 높음. for문 출력이 익숙해지면 쓰기. 
		System.out.println(Arrays.toString(cat));
	}//3차원 배열의 경우 잘 사용 x -> 다차원 배열이 있다.
	
}
}
