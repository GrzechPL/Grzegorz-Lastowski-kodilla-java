package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class KodillaCourseApplication
{

	public static void main(String[] args)
	{
		//FirstClass.metodax();
		FirstClass firstClass = new FirstClass();
		String przy = firstClass.przyklad;
		System.out.println(przy);


	}
}

