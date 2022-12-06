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
