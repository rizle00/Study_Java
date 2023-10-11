package pack02_member;

public class MemberMain {
public static void main(String[] args) {
	Member.sField = 0;
	System.out.println(Member.sField);
	Member.sMethod();
	Member member = new Member();
	member.iField = 1;
	System.out.println(member.iField);
	member.iMethod();
	member.iMethod(12);
	member.iMethod("A");
	member.iMethod("S", 2);
}
}
