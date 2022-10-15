                                                        实验三 基于继承关系改进学生选课模拟系统
一、实验目的
====
掌握权限访问控制修饰符的使用；
掌握继承的使用。

二、业务要求
====
1.保持实验二的代码和readme版本不变；

2.新建代码仓库，在实验二代码的基础上完成本次实验；

3.业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义。

4.测试实体类分别存放于不同的package中，验证权限访问控制，继承后属性及方法的可见性。

三、解题思路
====
1、首先定义五个系统角色类，分别是人员People类、教师Teacher类、学生Students类、课程Course类。

2、根据要求说明，挖掘其中的逻辑关系；容易发现，通过打印学生信息，可以实现对课程与老师信息的输出，故可以得到他们之间的包含关系：学生信息→课程信息→教师信息，考虑到一个学生只能选一门课，一门课只能由一个老师教授，可知这条单链包含关系就可以使其相关联。

3.为测试类以外的四个类添加属性与方法，将People类设为Teacher类与Students类的父类，这两个子类可以通过继承获取父类的id、name、gender等属性并且继承相应的方法。

四、流程图
====

五、关键代码
====
1.创建People类

public class People {

	int id;
	String name;
	String gender;
	Course course;
	People(int i,String n,String g){
		id=i;
		name=n;
		gender=g;
	}
}

2.通过extends关键字继承People类

class Students extends People {

	String major;
	Students(int i,String n,String g){
		super(i,n,g);
	}
	void xk(Course n) {
		course=n;
	}
}

class Teacher extends People {

	Teacher(int i,String n,String g){
		super(i,n,g);
	}
}

六、系统运行截图
=====

七、感想与体会
=====


