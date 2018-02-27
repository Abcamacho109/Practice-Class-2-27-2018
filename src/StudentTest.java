import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);

Student  FirstName1 = new Student ("Anthony", "Francis" ,"Smith", 345008);

Student FirstName2 = new Student ("Ashley", "Isabella" ,"Davis", 364666);
System.out.println("Hello Ashley How are you?");
System.out.println("1.View name , major and classification");
System.out.println("2.Set Major");
System.out.println("3.Set Classification");
System.out.println("4.Exit");
int lop = scan.nextInt();

if (lop ==1){
	System.out.println(FirstName1.FirstName);
	System.out.println(FirstName1.Major);
	System.out.println(FirstName1.Classification);
}else if (lop ==2){
System.out.println("Enter a new major?");	
String newmajor = scan.nextLine();
}else if (lop == 3){
	System.out.println("Enter a new classification");
	String news = scan.nextLine();
}else if(lop ==4){


	}
	
}
}