package Qgjx;

public class Laboratory {
	int i;
	String name;
	String score[]=new String [5];
	double income[]=new double [5];
	Laboratory(String name,String score[]) {
		this.name=name;
		this.score=score;
		while(i<score.length)
		{
			if(score[i].equals("优")) {
				income[i]= 10000;
			}
			else if(score[i].equals("良")) {
				income[i]=8000;
			}
			else if(score[i].equals("及格")) {
				income[i]=5000;
			}
			else if(score[i].equals("不及格")) {
				income[i]=2000;
			}
			i++;
		}
	}

}
