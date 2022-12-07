                                                           实验六 文件输入输出
一、实验目的
============
掌握文件输入输出；<br>
掌握对象序列化方法。

二、业务要求
============
在实验三的基础上，利用文件保存选课结果，过程如下：<br>
1.采用对象序列化的writeObject方法把选课结果存到硬盘文件系统中；<br>
2.采用对象序列化的readObject方法从文件中恢复对象，并操作学生的选课课表，实现退课操作；<br>
3.打印课程对象信息，采用覆盖定义toString（）方法的方式。<br>

三、解题思路
============
1、首先定义五个系统角色类，分别是人员People类、教师Teacher类、学生Students类、课程Course类。<br>
2、根据要求说明，挖掘其中的逻辑关系；容易发现，通过打印学生信息，可以实现对课程与老师信息的输出，故可以得到他们之间的包含关系：学生信息→课程信息→教师信息，考虑到一个学生只能选一门课，一门课只能由一个老师教授，可知这条单链包含关系就可以使其相关联。<br>
3.为测试类以外的四个类添加属性与方法，将People类设为Teacher类与Students类的父类，这两个子类可以通过继承获取父类的id、name、gender等属性并且继承相应的方法。<br>
4.用FileOutputStream写入到文件。<br>
5.用FileInputStream读取。<br>

四、流程图
===========
!(流程图)[]

五、关键代码
===========
try {

				FileOutputStream file_out_stm = new FileOutputStream("选课.txt");
				ObjectOutputStream obj_out_stm = new ObjectOutputStream(file_out_stm);
				obj_out_stm.writeObject(s2);
				obj_out_stm.flush();
				FileInputStream file_in_stm = new FileInputStream("选课.txt");
				ObjectInputStream obj_in_stm = new ObjectInputStream(file_in_stm);
				Students stu=(Students)obj_in_stm.readObject();
				System.out.println("读取的学生信息:");
				//System.out.println("学生名称："+stu.name+" 编号:"+ stu.course.id +" 课程名称:"+ stu.course.cname +" 时间:"+ stu.course.time+" 授课教师:"+stu.course.teacher.name);
				file_in_stm.close();
				file_out_stm.close();
				obj_in_stm.close();
				obj_out_stm.close();

			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
六、运行结果
==========
!(运行结果)[https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E5%85%AD%20%E6%96%87%E4%BB%B6%E8%BE%93%E5%85%A5%E8%BE%93%E5%87%BA/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png]
七、感想与体会
===========
学会了序列化、反序列化。
