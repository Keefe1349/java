package Stringprocessing;
import java.io.*;
import java.util.Scanner;
public class Stringprocessing {
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>");
		int n=text.length()/7;
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
         
		System.out.println(text);
		try {
			String str = new String(text);
			byte[] sb = str.getBytes();
			FileOutputStream out = new FileOutputStream("poetry.txt");
			out.write(sb);
			out.close();
		} catch (IOException e) {
			System.out.println("File write error:+e");
		}
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入想要查询的词/字：");
	String strrr = sc.nextLine();
	String str = text.toString();
	int num =test(str,strrr);
	System.out.println("您所查询的词/字出现了"+num+"次");
}


 public static int test(String a,String b){
  int len=b.length(); 
  int num=0;
  while(a.indexOf(b)!=-1) {
   a=a.substring(a.indexOf(b)+len);
   num++;
  } 
   return num;
 } 
}

