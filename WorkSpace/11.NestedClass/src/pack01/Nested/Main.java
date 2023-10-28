package pack01.Nested;

import pack01.Nested.KymNested.Kym1;
import pack01.Nested.KymNested.Kym1.Test;
import pack01.Nested.KymNested.TestC.TestZ.TestB;

public class Main {
public static void main(String[] args) {
	TestB b = new KymNested.TestC().new TestZ().new TestB();
	b.rtnMethod().method1();
	
}
}
