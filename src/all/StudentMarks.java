package all;

import java.io.Serializable;

public class StudentMarks implements Serializable
{
	int Stu_ID;	
	int Module_ID;
	int CWK_Marks;
	int EXM_Marks;
	int OVL_Marks;
	
	public void serialize(int sID,int mID,int cm, int em, int om)
	{
		Stu_ID = sID;
		Module_ID = mID;
		CWK_Marks = cm;
		EXM_Marks = em;
		OVL_Marks = om;
	}
	
	
	public void deserialize()
	{
		System.out.println("----Deserialized Message---");
		System.out.println("Student ID:=>"+Stu_ID);
		System.out.println("Module ID:=>"+Module_ID);
		System.out.println("CWK Marks:=>"+CWK_Marks);
		System.out.println("EXM Marks:=>"+EXM_Marks);
		System.out.println("OVL Marks:=>"+OVL_Marks);
	}
	
	
}
