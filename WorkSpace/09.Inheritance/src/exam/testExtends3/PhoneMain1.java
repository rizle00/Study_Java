package exam.testExtends3;

public class PhoneMain1 {
	public static void main(String[] args) {
		DmbPhone dmb = new DmbPhone("dmb 삼성", "검정", 0);
		System.out.println(dmb.model+" "+dmb.color + " 준비완료");
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("hello");
		dmb.receiveVoice();
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.changeChannel(10);
		dmb.turnOffDmb();
		
		dmb.powerOff();
		
	}
}
