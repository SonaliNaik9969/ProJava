package hierarchical_Inheritance;

import java.util.Scanner;
//one class is inherited by many sub classes.
class Staff
 {
	 protected int id;
	 protected String name;
	 
 }
 class Teacher extends Staff
 {
	 private String subject;
	 private int exp;
	 public void read()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id,name,subject and experience of the teacher :");
		 id = sc.nextInt();
		 name = sc.next();
		 subject = sc.next();
		 exp = sc.nextInt();
	 }
	 public void display()
	 {
		 System.out.println("Teacher's Details:\nID :" +id+ "\nName :" +name+ "\nSubject :"+subject+ "\nExperience :"+exp);
	 }
 }
 class Typist extends Staff
 {
	 protected int speed;
	 protected int exp;
	 public void read()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id,name,speed and experience of typist");
		 id = sc.nextInt();
		 name = sc.next();
		 speed = sc.nextInt();
		 exp = sc.nextInt();
	 }
	 public void display()
	 {
		 System.out.println("Typist's Detaila:\nID :" +id+ "\nName :" +name+ "\nSpeed :" +speed+ "\nExperience :"+exp);
	 }
	 
 }
 class Officer extends Staff
 {
	 private int grade;
	 private String dept;
	 public void read()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id,name,grade and department of officer :");
		 id = sc.nextInt();
		 name = sc.next();
		 grade = sc.nextInt();
		 dept = sc.next();
	 }
	 public void display()
	 {
		 System.out.println("Officer's Details:\nID :" +id+ "\nName :" +name+ "\nGrade : " +grade+ "\nDepartment :"+dept);
	 }
 }
 class Regular extends Typist
 {
	 private float salary;
	 public void read()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter id,name,speed,exp and salary of regulay typist :");
		 id = sc.nextInt();
		 name = sc.next();
		 speed = sc.nextInt();
		 exp = sc.nextInt();
		 salary = sc.nextFloat();
	 }
	 public void display()
	 {
		 System.out.println("Regular Typist Details:\nID :" +id+ "\nName :" +name+ "\nSpeed :" +speed+ "\nExperience :" +exp+ "\nSalary :" +salary);
	 }
 }
 class Casual extends Typist
 {
	 private float daily_wages;
	 public void read()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter id,name,speed,exp and salary of regulay typist :");
		 id = sc.nextInt();
		 name = sc.next();
		 speed = sc.nextInt();
		 exp = sc.nextInt();
		 daily_wages = sc.nextFloat();
	 }
	 public void display()
	 {
		 System.out.println("Regular Typist Details:\nID :" +id+ "\nName :" +name+ "\nSpeed :" +speed+ "\nExperience :" +exp+ "\nDaily_Wages :" +daily_wages);
	 }
 }
public class Hierarchical_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1. Teacher\n2. Officer\n3. Regular Typist\n4. Casual Typist\nEnter yor choice, whose details you want to enter :");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			Teacher t = new Teacher();
			t.read();
			t.display();
			break;
			
		case 2:
			Officer o = new Officer();
			o.read();
			o.display();
			break;
			
		case 3:
			Regular rt = new Regular();
			rt.read();
			rt.display();
			break;
			
		case 4:
			Casual c = new Casual();
			c.read();
			c.display();
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	

}
