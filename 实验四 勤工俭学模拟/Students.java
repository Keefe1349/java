package Qgjx;

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

}
