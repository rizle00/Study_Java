package pack03.exArray2;

public class Test01_Array {
public static void main(String[] args) {
	//[2단] [3단] [4단] ... [9단]
	int [][] gArr =new int [8][9];
	for (int i=0; i<gArr.length; i++) { // 8x9
		System.out.println((i+2)+"단입니다");
		for(int j=0; j<gArr[i].length; j++) {
			gArr[i][j]=(i+2)*(j+1);
			//
			System.out.println((i+2)+"x"+(j+1)+"="+gArr[i][j]);
			// 디버그 모드를 잘 확인하자, 일단 해보자 !
		
		}
	}
}
}
