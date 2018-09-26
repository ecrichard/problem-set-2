import java.util.Scanner;
import java.lang.Math; 
import java.text.*;

/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	Scanner in = new Scanner(System.in);
	public void sayHello() {
		System.out.println("What is your first and last name?");
		String text = in.nextLine();
		System.out.println("Hello " + text + "!");
	}
	
	public void gradeMe() {
		System.out.println("What is your homework score?");
		double homesco = in.nextDouble();
		System.out.println("What is your homework score?");
		homesco += in.nextDouble();
		System.out.println("What is your homework score?");
		homesco += in.nextDouble();
		System.out.println("What is your quiz score?");
		double quizsco = in.nextDouble();
		System.out.println("What is your quiz score?");
		quizsco += in.nextDouble();
		System.out.println("What is your quiz score?");
		quizsco += in.nextDouble();
		System.out.println("What is your test score?");
		double testsco = in.nextDouble();
		System.out.println("What is your test score?");
		testsco += in.nextDouble();
		System.out.println("What is your test score?");
		testsco += in.nextDouble();
		homesco = homesco / 3;
		quizsco = quizsco / 3;
		testsco = testsco / 3;
		double fgrade = (homesco * .15) + (quizsco * .3) + (testsco * .55);
		NumberFormat pform = new DecimalFormat("###.00");
		System.out.println(pform.format(fgrade) + "%");
	}
	
	public void groupUs() {
		System.out.println("How many students?");
		int students = in.nextInt();
		System.out.println("How many teachers?");
		int teachers = in.nextInt();
		int total = students + teachers;
		float busnum = total / 47;
		if ((total % 47) > 0) {
			busnum++;
		}
		float nump = total / busnum;
		nump = (float) Math.floor(nump);
		System.out.println(busnum + " buses. with " + nump + " people on each one");
	}
	
	public void info() {
		System.out.print("What is your first name?");
		String fname = in.nextLine();
		fname = in.nextLine();
		System.out.print("\nWhat is your last name?");
		String lname = in.nextLine();
		System.out.print("\nWhat grade are you in?");
		int grade = in.nextInt();
		System.out.print("\nWhat is your age?");
		int age = in.nextInt();
		System.out.print("\nWhat is your hometown?");
		System.out.print("\n");
		String htown = in.nextLine();
		htown = in.nextLine();
		System.out.println("NAME     : " + fname + " " + lname);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + htown);
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		String oname = in.nextLine();
		System.out.print("\nPlease enter your middle name: ");
		String mname = in.nextLine();
		System.out.print("\nPlease enter your last name: ");
		String tname = in.nextLine();
		System.out.print("\n");
		System.out.println("Your intials are " + oname.charAt(0) + mname.charAt(0) + tname.charAt(0) );
		in.close();
	}
}