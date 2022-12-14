                                                           实验五 古诗词文本处理
一、实验目的
===========
掌握字符串String及其常用方法的使用<br>
掌握输入输出流的使用

二、实验要求
============
有《长恨歌》古诗词，在经某程序处理后，被删去了非汉字部分，如标点符号、回车换行等。现请设计程序恢复，并把恢复后的诗歌写入某个文本文件。<br>
要求如下：<br>
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；<br>
2.允许提供输入参数，统计古诗中某个字或词出现的次数。

三、解题思路
===========
1.用StringBuffer类text存储文本<br>
1.在7*(i+1)+i处使用insert()加标点，i为偶数时加“，”，i为奇数时加“。”<br>
2.用FileOutputStream写入到文件<br>
3.用Scanner对象解析字符序列中的文字，并输出出现次数

四、流程图
============
![流程图](https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E4%BA%94%20%E5%8F%A4%E8%AF%97%E8%AF%8D%E6%96%87%E6%9C%AC%E5%A4%84%E7%90%86/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

五、关键代码
===============
1、添加符号<br>
for (int i=0;i<n;i++){

			if (i%2==0) {
				text.insert(7*(i+1)+i, "，");
			}
			else   {
				text.insert(7*(i+1)+i, "。");
			}
		}
		int m=text.length()/16;
		for (int i=0;i<m;i++){
			text.insert(16*(i+1)+i, "\n");
		}
 
 2、写入到文本文件<br>
 try {
 
			String str = new String(text);
			byte[] sb = str.getBytes();
			s out = new FileOutputStream("poetry.txt");
			out.write(sb);
			out.close();
		} catch (IOException e) {
			System.out.println("File write error:+e");
      }
    
3、实现查询功能
{

    Scanner sc=new Scanner(System.in);
	  System.out.println("请输入想要查询的词/字：");
	  String strrr = sc.nextLine();
	  String str = text.toString();
	  int num =test(str,strrr);
	  System.out.println("您所查询的词/字出现了"+num+"次");
}

六、系统运行截图
=============
![运行结果](https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E4%BA%94%20%E5%8F%A4%E8%AF%97%E8%AF%8D%E6%96%87%E6%9C%AC%E5%A4%84%E7%90%86/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
![写入结果](https://github.com/Keefe1349/java/blob/main/%E5%AE%9E%E9%AA%8C%E4%BA%94%20%E5%8F%A4%E8%AF%97%E8%AF%8D%E6%96%87%E6%9C%AC%E5%A4%84%E7%90%86/%E5%86%99%E5%85%A5%E7%BB%93%E6%9E%9C.png)

七、感想与体会
============
学会了字符串String、StringBuffer类的基本用法，用FileOutputStream写入到文件，以及Scanner类。
