package com.day_1_to_4;

public class ex_loops {
	public static void main(String[] args) {
//		for(int hour=1;hour<=12;hour++) {
//			
//			double temp = 98.6;
//			System.out.println("hour "+hour + "Temperature="+ temp);
//		}
		
//		int heartrate= 120;
//		
//		while(heartrate>100) {
//			System.out.println("current herart rate is" + heartrate + "wait until get normal");
//			heartrate -=5;
//		}
//		System.out.println("now normal");
		
//		int oxygenlevel= 80;
//		do {
//			System.out.println("present oxygenlevel is " + oxygenlevel);
//			oxygenlevel +=5;
//		}
//		while(oxygenlevel<95);
//		{
//			System.out.println("oxygenlevel is normal"+oxygenlevel);
//		}
		int[] heartrate = {72,85,102,90,65};
		for (int rate: heartrate) {
			System.out.println("Heart rate is"+rate);
			
			if(rate>100) {
				System.out.println("Heart rate is high");
			}
			else if(rate<60) {
				System.out.println("Heart rate is low");
			}
			else{
				System.out.println("Heart rate is normal");
			}
		}
	}

}
