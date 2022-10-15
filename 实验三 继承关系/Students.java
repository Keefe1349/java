package jicheng;

class Students extends People {
	String major;
	Students(int i,String n,String g){
		super(i,n,g);
	}
	void xk(Course n) {
		course=n;
	}
}