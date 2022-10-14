package xuanke;
//课程（编号、课程名称、上课地点、时间、......）
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