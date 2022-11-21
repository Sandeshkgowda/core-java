package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.ProgrammingLanguage;

public class ProgrammingLanguageTester {
	public static void main(String[] args) {
		ProgrammingLanguage prog = new ProgrammingLanguage();
		prog.course("java");
		System.out.println(prog.name);
	}

}
