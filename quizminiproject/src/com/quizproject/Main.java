package com.quizproject;

import java.sql.SQLException;
import java.util.Scanner;
import com.student.StudentInfo;
import com.teacher.*;

public class Main {
	public void menu() throws SQLException
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t"+"Start QUIZ "+"\n");
		System.out.println("\t"+"Are You A ? "+"\n");
		System.out.println("\t"+"1. Teacher. ");
		System.out.println("\t"+"2. Student. ");
		TeacherInfo t= new TeacherInfo();
		StudentInfo s=new StudentInfo();
		
		n=sc.nextInt();
		switch(n)
		{
			case 1: System.out.println("**WELCOME**");
					t.teacherLogin();
					
					break;
			case 2: System.out.println("**Welcome**");
					s.setstudentForm();
					break;
			default: System.out.println("Invalid Input");
		}
	}
	
	public static void main(String [] args) throws SQLException
	{
		Main mn = new Main();
		mn.menu();
	}

}
