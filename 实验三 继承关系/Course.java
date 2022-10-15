package jicheng;

class Course{
		int id;
		String cname;
		String place;
		String time;
		Teacher teacher;
		Course(int i,String n,String p,String t,Teacher te){
			id=i;
			cname=n;
			place=p;
			time=t;
			teacher=te;
		}
}
