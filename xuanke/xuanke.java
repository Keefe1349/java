package xuanke;
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