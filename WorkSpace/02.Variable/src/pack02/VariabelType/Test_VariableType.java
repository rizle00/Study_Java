package pack02.VariabelType;

public class Test_VariableType {
public static void main(String[] args) {
	byte byte1=127;
	short short1=29229;
	int int1=1202569070;
	long long1=222222222222222222l;
	char var1='A';
	String string1="asd";
	
	System.out.println(byte1);
	System.out.println(short1);
	System.out.println(int1);
	System.out.println(long1);
	System.out.println(var1);
	System.out.println(string1);
	
	{int a=3; 
	System.out.println(a);
	
		{int b=4;
			{System.out.println(a);
			int c=5;
			System.out.println(b);
				
			}
		}
	}
	
}
}
