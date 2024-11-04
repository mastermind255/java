package javaprogram;

public class Constructorex2 {
	int eid;
	String name;
	double salary;
	Constructorex2(){
		System.out.println("un parametrized constructor ");
	}
	Constructorex2(int eid){
		this();
		this.eid=eid;
		System.out.println("eid="+eid);
	}
	Constructorex2(int eid, String name ){
		this(eid);
		this.eid=eid;
		this.name=name;
		System.out.println("eid="+eid+"\n"+"name="+name);
	}
	Constructorex2(int eid, String name,double salary ){
		this(eid,name);
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		System.out.println("eid="+eid+"\n"+"name="+name+"\n"+"salary="+salary);
	}
	
	public static void main(String[] args) {
		Constructorex2 s=new Constructorex2(1001,"didu",25000);

	}

}
