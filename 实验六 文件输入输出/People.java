package jicheng;
public class People{

	int id;
	String name;
	String gender;
	Course course;
	People(){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.course=course;
	}
	People(int id,String name,String gender){
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	public String getName() {  
        return name;  
    } 
}
