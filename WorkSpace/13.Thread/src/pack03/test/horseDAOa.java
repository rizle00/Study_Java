package pack03.test;

import java.util.Iterator;
import java.util.Random;

public class horseDAOa {

		horseDTOa[] horseArr;
		private int rank;
		
		public horseDAOa(int inputNum) {
			horseArr = new horseDTOa[inputNum]; //  초기화
			//dto = new...
			//dto.set...
			for (int i = 0; i < horseArr.length; i++) {
				horseArr[i] = new horseDTOa(i+1+".말");
//				horseArr[i].setHorseThread(null);
				horseArr[i].setHorseThread(getHorseThread(horseArr[i]));
				horseArr[i].getHorseThread().start();
			}
		}
		
		public Thread getHorseThread(horseDTOa dto) {
			
			Thread thread = new Thread(()->{
				while(isMove(dto)) {
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					horseMoving(dto);
				}
				if(dto.getRank()==0) {
					dto.setRank(++rank);// dto 랭크와 다른 랭크
					if(rank == horseArr.length) {
						finish();
					}
				}
			});
			return thread;
			
		}
		public void finish() {
			System.out.println("순위 출력");
			for (int i = 0; i < horseArr.length; i++) {
				System.out.println(horseArr[i].getName()+""+horseArr[i].getRank()+"등");
			}
		}

		public void horseMoving(horseDTOa dto) {
			
			dto.setMove(dto.getMove()+new Random().nextInt(30)+1);
			System.out.println(dto.getName()+""+dto.getMove()+"m");
		}
		// 100 보다 작은 move 값이면 true, false
		public boolean isMove(horseDTOa dto) {
			if(dto.getMove()<100) {
				return true;
			}
			return false;
		}
		
}
