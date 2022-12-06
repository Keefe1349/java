package Qgjx;

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
