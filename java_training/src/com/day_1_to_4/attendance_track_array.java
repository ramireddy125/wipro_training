package com.day_1_to_4;
import java.util.Scanner;


public class attendance_track_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] days = {"mon","tus","wed","thu","fri","sat"};
		String[] attendance = new String[7];
		
		System.out.println("mark attendance for each day as p or a:");
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]+ ":");
			attendance[i] = sc.next();
		}
		int p =0;
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]+ ":" + (attendance[i].equals("p")? "present":"absent"));
			if(attendance[i].equals("p")) {
				p++;
			}
		}
		System.out.println("present days"+p);
		System.out.println("absent days"+ (7-p));
		sc.close();
	}

}
