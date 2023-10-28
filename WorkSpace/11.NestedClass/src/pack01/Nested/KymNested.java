package pack01.Nested;

public class KymNested {
	
	static class TestA {
		int field = 10;
		
		public void method1() {
			System.out.println("정답");
		}
	}
	
	public static class TestC{
		public class TestZ{
			public class TestB{
				public TestA rtnMethod() {
					return new TestA();
				}
			}
		}
	}
	public static class Kym1{
		public class Test{
			public class Test_Sub{
				public int test = 10;
				public void method() {
					System.out.println("ㅁㅁㅁㅁ");
				}
			}
		}
	} public static void main(String[] args) {
		pack01.Nested.KymNested.Kym1.Test.Test_Sub test 
		= new KymNested.Kym1().new Test().new Test_Sub();
		System.out.println(test.test);
		test.method();
	}
}

