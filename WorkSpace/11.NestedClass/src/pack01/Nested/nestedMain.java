package pack01.Nested;

import pack01.Nested.Nested.NesInner;
import pack01.Nested.Nested.NesInner2;

public class nestedMain {
public static void main(String[] args) {
	Nested nes = new Nested();
	nes.method();
	Nested.method2();
	
	NesInner nesI =  nes.new NesInner();
//	NesInner nesI =  new Nested().new NesInner();
	nesI.iField = "kmj";
	nesI.iMethod();
	
	NesInner2.iint = 1;
	NesInner2 nesS = new NesInner2();
	nesS.iField = "aa";
	nesS.iMethod();
//	nes.nesInner3.
//	NesInner3 nes3 = new nes.nesInner3();
}
}
