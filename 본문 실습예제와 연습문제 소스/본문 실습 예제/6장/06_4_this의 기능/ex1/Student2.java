package ch6.ex4;

public class Student2{
	protected String name;  //이름
	protected int grade;   //학년
	//private String name;  //private 로 지정하면 상속이 안된다.
	//private int grade; 

  public Student2() {System.out.println("Student 부모 생성자 호출");}

  public String getName() {return name;}
  public int getGrade() {return grade;}

  public void setName(String name){
	  this.name=name;
  }
  
  public void setGrade(int grade){
	  this.grade=grade;
  }
  public String getStudInfo() { 
   System.out.println("Student 클래스의 getStudInfo 호출");
   return "이름은 : " + name + "학년은 : " + grade;
  }
}

