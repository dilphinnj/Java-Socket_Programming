package all;

import java.io.Serializable;


public class StudentInfo implements Serializable
{
	int stuId;	
	String fName;
	String lName;
	String add1;
	String add2;
	
	public void serialize(int sID,String fn,String ln, String a1, String a2)
	{
		stuId = sID;
		fName = fn;
		lName = ln;
		add1 = a1;
		add2 = a2;
	}
	
	
	public void deserialize()
	{
		System.out.println("----Deserialized Message---");
		System.out.println("Student ID:=>"+stuId);
		System.out.println("Student First Name:=>"+fName);
		System.out.println("Student Last Name:=>"+lName);
		System.out.println("Student add1:=>"+add1);
		System.out.println("Student add2:=>"+add2);
	}
	

}
