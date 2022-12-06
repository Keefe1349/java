package jicheng;
class Course{
	int id;
	String cname;
	String place;
	String time;
	Teacher teacher;
	Course(int id,String cname,String place,String time,Teacher teacher){
		this.id=id;
		this.cname=cname;
		this.place=place;
		this.time=time;
		this.teacher=teacher;
}
}