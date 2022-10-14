                                                              实验二  学生选课模拟系统
一、实验目的
====
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握通过构造方法实例化对象；

二、业务要求
====
学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。初期为了设计简单，每名教师讲1门课程，每名学生选1门课程。
对象：	教师（编号、姓名、性别、所授课程）
			学生（编号、姓名、性别、所选课程）
			课程（编号、课程名称、上课地点、时间）
			
三、解题思路
====
1、首先定义三个系统角色类，分别是教师teacher类、学生student类、课程course类。
2、根据要求说明，挖掘其中的逻辑关系；容易发现，通过打印学生信息，可以实现对课程与老师信息的输出，故可以得到他们之间的包含关系：学生信息→课程信息→教师信息，考虑到一个学生只能选一门课，一门课只能由一个老师教授，可知这条单链包含关系就可以使其相关联。

四、流程图
====

五、关键代码
====
1.定义teacher类

class teacher{

	int id;
	String name;
	String gender;
	course course;
	teacher(int i,String n,String g){
		id=1;
		name=n;
		gender=g;	
	}
}
2.定义student类

class student{	

	int id;
	String name;
	String gender;
	course course;
	student(int i,String n,String g){
		id=1;
		name=n;
		gender=g;
	}
	void xk(course n) {
		course=n;
	}
}
3.定义course类

class course{

	int id;
	String cname;
	String place;
	String time;
	teacher teacher;
	course(int i,String n,String p,String t,teacher te){
		id=i;
		cname=n;
		place=p;
		time=t;
		teacher=te;
	}
}
4.选课

public class xuanke {

	public static void main(String[] args) {
		//创建teacher对象
		teacher t1=new teacher(1,"张三","男");
		teacher t2=new teacher(2,"李四","女");
		//创建course对象
		course c1=new course(1,"数学","教101","8:00",t1);
		course c2=new course(2,"物理","教303","10:00",t2);
		//创建student对象
		student s1=new student(1,"小王","男");
		s1.xk(c1);
		System.out.println("学生信息");
		System.out.println("编号:"+ s1.course.id +"课程名称:"+ s1.course.cname +"时间:"+ s1.course.time+"授课教师:"+s1.course.teacher.name);
	}

}
