package ex0309.dto;

/**
 * 사원정보의 속성을 관리하는 객체
 * */
public class Emp {
   private int empno;
   private String ename;
   private int sal;
   private String hiredate;
   
   public Emp() {}
   public Emp(int empno, String ename, int sal, String hiredate) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.sal = sal;
	this.hiredate = hiredate;
   }
   
   public int getEmpno() {
	return empno;
   }
   public void setEmpno(int empno) {
	this.empno = empno;
   }
   public String getEname() {
	return ename;
   }
   public void setEname(String ename) {
	this.ename = ename;
   }
   public int getSal() {
	return sal;
   }
   public void setSal(int sal) {
	this.sal = sal;
   }
   public String getHiredate() {
	return hiredate;
   }
   public void setHiredate(String hiredate) {
	this.hiredate = hiredate;
   }
   
   @Override
   public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Emp [empno=");
	builder.append(empno);
	builder.append(", ename=");
	builder.append(ename);
	builder.append(", sal=");
	builder.append(sal);
	builder.append(", hiredate=");
	builder.append(hiredate);
	builder.append("]");
	return builder.toString();
   }
   
}
