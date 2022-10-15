package jicheng;

public class Xuanke {

		public static void main(String[] args) {
			//创建teacher对象
			Teacher t1=new Teacher(1,"张三","男");
			Teacher t2=new Teacher(2,"李四","女");
			//创建course对象
			Course c1=new Course(1,"数学","教101","8:00",t1);
			Course c2=new Course(2,"物理","教303","10:00",t2);
			//创建student对象
			Students s1=new Students(1,"小王","男");
			s1.xk(c1);
			System.out.println("学生信息");
			System.out.println("编号:"+ s1.course.id +"课程名称:"+ s1.course.cname +"时间:"+ s1.course.time+"授课教师:"+s1.course.teacher.name);
		}

}
