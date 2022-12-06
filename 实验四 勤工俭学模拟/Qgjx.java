package Qgjx;
import java.util.Arrays;
public class Qgjx {
	static int i,j;
	public static void main(String[] args) {
		String socre1[]={"优","优","良","良","优"};
		String socre2[]={"优","良","良","良","优"};
		String socre3[]={"良","及格","良","良","优"};
		String socre4[]={"优","良","优","及格","优"};
		String socre5[]={"良","优","优","良","优"};
		Laboratory laboratory1=new Laboratory("计算机网路实验室",socre1);
		Laboratory laboratory2=new Laboratory("组成原理实验室",socre2);
		Laboratory laboratory3=new Laboratory("物理实验室",socre3);
		Laboratory laboratory4=new Laboratory("化学实验室",socre4);
		Laboratory laboratory5=new Laboratory("数学实验室",socre5);
		Laboratory laboratorys1[]= {laboratory1,laboratory2};
		Laboratory laboratorys2[]= {laboratory3,laboratory4};
		Laboratory laboratorys3[]= {laboratory5};
		Students student1= new Students("张三",laboratorys1);
		Students student2= new Students("李四",laboratorys2);
		Students student3= new Students("王五",laboratorys3);
		Students student[]={student1,student2,student3};
		while(i<3) {
			System.out.println(student[i].name+"的实际收入："+student[i].realincome);
			i++;
		}
		i=0;
		j=1;//第j+1名学生
		System.out.println(student[j].name+"的清洁记录如下：");
		while(i<student[j].laboratory.length) {
			String str=Arrays.toString(student[j].laboratory[i].score);
			System.out.println(student[j].laboratory[i].name+str);
			i++;
		}
	}

}
