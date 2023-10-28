package pack00.test;

public class CDNested {
	public static class CD1 {
		
		public class Test {
			String str = "변수";

			public class CD4 {
				public class CD5 {
					private class CD2 {
						void method2() {
							System.out.println("str과 메소드 출력시 성공");
						}
					}

					public CD5() { //생성자
						CD2 cd2 = new CD2();
						cd2.method2();
					}
				}
			}
		}
	}

}