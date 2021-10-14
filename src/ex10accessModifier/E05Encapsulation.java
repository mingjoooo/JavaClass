package ex10accessModifier;
/*
캡슐화(Encapsulation)
	: 여러가지 업무 로직을 하나로 묶는다는 의미와
	업무의 순서까지 고려한 형태의 로직을 구성한다는 의미를
	가지고있다. 즉 관련있는 로직을 하나로 묶는것을 말한다.
 */
//아래 4가지 업무는 번호순서대로 진행해야 한다고 가정한다.
class MemberRegist{
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다");
	}
}
class CongratulationPoint{
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}
}
class AutoLogin{
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}
}
class FirstLoginEvnet{
	void doFirstLoginEvnet() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다.");
	}
}
/*
업무의 순서를 고려하여 관련된 메서드를 하나의 클래스를 정의하였다.
차후에는 별도의 분석없이 해당 클래스의 메서드만 호출하면 업무는
차질없이 진행될 것이다.
 */
class EncapsulLogin{
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvnet firstLoginEvnet = new FirstLoginEvnet();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvnet.doFirstLoginEvnet();
	}
}
public class E05Encapsulation {

	public static void main(String[] args) {
		
		/*
		업무의 진행순서가 중요하다고 가정했을때 캡슐화 이전의 코드에서는
		개발자가 순서를 지키지 않는 상태에서도 실행이 가능한 코드가 된다.
		 */
		System.out.println("캡슐화 전 코드");
		
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvnet firstLoginEvnet = new FirstLoginEvnet();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		firstLoginEvnet.doFirstLoginEvnet();
		congratulationPoint.doCongratulationPoint();
		autoLogin.doAutoLogin();
		
		System.out.println("======================");
		
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogin().doProcess();

	}
}
