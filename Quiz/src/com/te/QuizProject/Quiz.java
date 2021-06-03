package com.te.QuizProject;

public class Quiz {

	public static void main(String[] args) {

		String q1 = "1) Which method of the Class.class is used to determine the name of a class represented by the class object as a String?  \n"
				+ "(a)getClass()\n(b)intern()\n(c)getName()\n(d)toString()\n";
		
		String q2 = "2) Which of the following option leads to the portability and security of Java?  \n"
				+ "(a)Bytecode is executed by JVM\n(b)The applet makes the Java code secure and portable\n(c)Use of exception handling\n(d)Dynamic binding between objects\n";

		String q3 = "3) Which of the following is not a Java features?  \n"
				+ "(a)Dynamic\n(b)Architecture Neutral\n(c)Use of pointers\n(d)Object-oriented\n";

		String q4 = "4) The \u0021 article referred to as a  \n"
				+ "(a)Unicode escape sequence\n(b)Octal escape\n(c)Hexadecimal\n(d)Line feed\n";
		
		String q5 = "5)  _____ is used to find and fix bugs in the Java programs.  \n"
				+ "(a)JVM\n(b)JRE\n(c)JDK\n(d)JDB\n";

		
		Question [] questions = {
				new Question(q1, "c"),
				new Question(q2, "a"),
				new Question(q3, "c"),
				new Question(q4, "a"),
				new Question(q5, "d")
		};
		Test.takeTest(questions);
	}
	
	
}
