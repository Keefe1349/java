                                                             实验四 学生实验室勤工俭学模拟
一、实验目的
=========
1.掌握系统中涉及类的定义；<br>
2.应用顶层Object类中toString()方法；<br>
3.掌握static、final等修饰符的用法。

二.实验内容
===========
某学校给学生提供勤工俭学机会，选派部分学生参与实验室的卫生清洁工作。每个学生被分配若干间实验室，视实验室的卫生评分给予劳务费。
例如：学生“张三”负责“计算机网络实验室”、“组成原理实验室”的清洁，每周被要检查，记录每间实验室的卫生评分。
在某周的检查中，“计算机网络实验室”卫生得“优”，“组成原理实验室”卫生得“及格”。
一次“优”按10000元记录补助，一次“及格”按5000元记录补助。
按国家的税务制度，劳务费应按国家规定纳税，请统计一学期学生的实际收入。

三、系统要求
==========
1.设计系统中的类；<br>
2.应用数组定义周数。方便赋值期间，一学期按5周计；<br>
3.每个学生负责的实验室数量不一定相同；<br>
4.对学期勤工俭学收入和纳税进行统计，求得实际收入；<br>
5.输出某学生的实验室清洁记录；<br>
6.国家最新纳税标准，属于某一时期的特定固定值，与实例化对象没有关系，考虑应用static、final修饰。

四、解题思路
==========
1、首先定义三个系统角色类，分别是学生Students类、实验室Laboratory类、收税Tax类。
2、定义数组laboratory1[]记录第一个实验室名称及其每周评分，各评分获得对应收入。
3、定义Students类包含学生信息及其打扫的实验室数组laboratorys[]。
4、将Students类中打扫的实验室每周对应收入相加并用Tax类计算收税后实际收入。
5、输出学生实际收入，输出某名学生的清洁记录。

五、流程图
===========
![流程图](https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E5%9B%9B%20%E5%8B%A4%E5%B7%A5%E4%BF%AD%E5%AD%A6%E6%A8%A1%E6%8B%9F/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

六、关键代码
============
1、创建Students类<br>
public class Students {

	int i,j;
	String name;
	Laboratory[] laboratory;
	double income[]=new double [5];
	double realincome;
	Students(String name,Laboratory[] laboratory){
		this.name=name;
		this.laboratory=laboratory;
		while(i<laboratory[0].score.length) {
			while(j<laboratory.length) {
				income[i]+=laboratory[j].income[i];
				j++;
			}
			income[i]=Tax.Tax(income[i]);
			j=0;
			i++;
		}
		i=0;
		while(i<laboratory[0].score.length) {
			realincome+=income[i];
			i++;
		}
}
  
2、创建Laboratory类<br>
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

3.建立Tax类<br>
public class Tax {

	static double rate;
	static double incometax;
	static double Tax(double x) {
		incometax=0;
		if(x<=5000) {
			rate=0;
			incometax+=x*rate;
		}
		else if(8000>=x&&x>5000) {
			rate=0.03;
			incometax+=(x-5000)*rate;
		}
		else if(17000>=x&&x>8000) {
			rate=0.1;
			incometax+=(x-5000)*rate;
		}
		else if(30000>=x&&x>17000) {
			rate=0.2;
			incometax+=(x-5000)*rate;
		}
		else if(40000>=x&&x>30000) {
			rate=0.25;
			incometax+=(x-5000)*rate;
		}
		x-=incometax;
		return x;
	}

}

七、系统运行截图
=========
![系统运行结果](https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E5%9B%9B%20%E5%8B%A4%E5%B7%A5%E4%BF%AD%E5%AD%A6%E6%A8%A1%E6%8B%9F/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)

八、感想与体会
==========
学会了应用toString()方法,使用static修饰。
