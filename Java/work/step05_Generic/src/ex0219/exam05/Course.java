package ex0219.exam05;

/**
 * 강좌를 등록하는 객체
 * */
public class Course {
   /**
   * 모든 사람들 허용(등록)
   * */
	public void register01(Applicant<?> applicant) {
		//등록하는 기능...
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청 완료~ - register01");
	}
	
  /**
   * 직장인 만 허용(등록)
   * */
   public void register02(Applicant<? super Worker> applicant) {
	   System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청 완료~ - register02");
	}
   
  /**
   * 학생들만 허용(등록)
   * */
   public void register03(Applicant<? extends Student> applicant) {
	   System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청 완료~ - register03");	
  }
}




