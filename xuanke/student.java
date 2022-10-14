package xuanke;
//学生（编号、姓名、性别、所选课程、......）
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