package jicheng;
import java.io.*;

public class Xuanke {

		public static void main(String[] args) throws ClassNotFoundException {
			//创建teacher对象
			Teacher t1=new Teacher(1,"张三","男");
			Teacher t2=new Teacher(2,"李四","女");

			//创建course对象
			Course c1=new Course(1,"数学","教101","8:00",t1);
			Course c2=new Course(2,"物理","教303","10:00",t2);

			//创建student对象
			Students s1=new Students(1,"小王","男",c1);
			Students s2=new Students(2,"小张","女",c2);
			System.out.println("学生信息");
			System.out.println("学生名称："+s1.name+" 编号:"+ s1.course.id +" 课程名称:"+ s1.course.cname +" 时间:"+ s1.course.time+" 授课教师:"+s1.course.teacher.name);
			try {
				FileOutputStream file_out_stm = new FileOutputStream("选课.txt");
				ObjectOutputStream obj_out_stm = new ObjectOutputStream(file_out_stm);
				obj_out_stm.writeObject(s2);
				obj_out_stm.flush();
				FileInputStream file_in_stm = new FileInputStream("选课.txt");
				ObjectInputStream obj_in_stm = new ObjectInputStream(file_in_stm);
				Students stu=(Students)obj_in_stm.readObject();
				System.out.println("读取的学生信息:");
				System.out.println("学生名称："+stu.name+" 编号:"+ stu.course.id +" 课程名称:"+ stu.course.cname +" 时间:"+ stu.course.time+" 授课教师:"+stu.course.teacher.name);
				file_in_stm.close();
				file_out_stm.close();
				obj_in_stm.close();
				obj_out_stm.close();

			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

}
