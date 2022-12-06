package jicheng;
import java.io.Serializable;
class Students extends People implements Serializable{
	String major;
	public Students(int id,String name,String gender,Course course){
		super(id,name,gender);
		this.course=course;
	}
	public int getId() {  
        return id;  
    }  
	 
}