package exam.testExtends;

public class ExtendMain {
	public static void main(String[] args) {
		Parent_Class par = new Parent_Class(); // 인스턴스화 : 인스턴스 멤버가 모두 메모리에 올라감
		System.out.println(par.parent_field1);
		System.out.println(par.parent_field2);
		System.out.println(par.getParent_field3());// private 접근 제한, getter setter 필요
		par.parentMethod();
		
		Child_Class child = new Child_Class();
		System.out.println(child.child_field);
		System.out.println(child.parent_field1);
		System.out.println(child.parent_field2);
		child.parentMethod();
		child.childMethod();
	}
}
