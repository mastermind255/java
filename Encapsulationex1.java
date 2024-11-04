package javaprogram;

public class Encapsulationex1 {
	private int empid;
	private String empname;
	public void setempid(int empid) {
		this.empid=empid;
	}
	public int getempid() {
	
	  return empid;
	}
	public void setempname(String empname) {
		this.empname=empname;
	}
	public String getempname() {
		return empname;
	}
	public static void main(String[] args) {
		Encapsulationex1 s=new Encapsulationex1();
		s.setempid(111);
		s.setempname("soumitra");
		System.out.println(s.getempid());
		System.out.println(s.getempname());
	}

}
