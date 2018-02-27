
public class Student {
String FirstName;
String MiddleInitial;
String LastName;
String Major;
String Classification;
int StudentId;

	public Student(String FirstName1, String MiddleInitial1, String LastName1, int StudentId1 ) {
		// TODO Auto-generated constructor stub
	FirstName = FirstName1;
    MiddleInitial = MiddleInitial1;
    LastName = LastName1;
    StudentId = StudentId1;
    
	}
public String PrintFullName(){
	return FirstName + MiddleInitial + LastName;
}
public void SetMajor (String NewMajor){
	Major = NewMajor;
	
}
public void SetClassification (String NewClassification){
	Classification = NewClassification;
}
}
