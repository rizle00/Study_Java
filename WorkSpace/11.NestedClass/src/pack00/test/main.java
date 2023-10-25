package pack00.test;

import pack00.test.CDNested.CD1;
import pack00.test.CDNested.CD1.Test;
import pack00.test.CDNested.CD1.Test.CD4;
import pack00.test.CDNested.CD1.Test.CD4.CD5;

public class main {
	
	
	
	
public static void main(String[] args) {
	
	Test test =new CDNested.CD1().new Test();
	System.out.println(test.str);
	CD5 cd = test.new CD4().new CD5();
	
	static final int  
	
}
}
