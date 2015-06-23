package all;

import java.io.IOException;
import java.security.Principal;
import java.security.acl.Acl;
import java.security.acl.AclEntry;
import java.security.acl.Group;
import java.security.acl.NotOwnerException;
import java.security.acl.Permission;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import sun.security.acl.*; 


public class ConnectDatabase {
	
	
	
	public static Connection con = null;
	
		
	public static void createCon()
	{
	
		 try
		     {
		         Class.forName("com.mysql.jdbc.Driver").newInstance();
		         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","stud_admin","s123");
		     
		     }
		 
		 catch(Exception e1)
		     {
		         System.out.println("Driver Error :"+ e1);
		     }
	 
	}
	
	public static void getStudentData()
	{
		ResultSet rStuDetails;
	    
        try {
                createCon();
                //System.out.println("size:");
                Statement st = con.createStatement();
                rStuDetails = st.executeQuery("SELECT * FROM student_info");
               // rStuDetails.beforeFirst();
                
                
               // System.out.println(val1);
                
                int i = 0;
                
                ArrayList<Integer> sID = new ArrayList<Integer>();
                ArrayList<String> sFName = new ArrayList<String>();
                ArrayList<String> sLName = new ArrayList<String>();
                ArrayList<String> sAdd1 = new ArrayList<String>();
                ArrayList<String> sAdd2 = new ArrayList<String>();
               
                
                while(rStuDetails.next())
                {
                    sID.add(rStuDetails.getInt(1));
                    sFName.add(rStuDetails.getString(2));
                    sLName.add(rStuDetails.getString(3));
					sAdd1.add(rStuDetails.getString(4));
					sAdd2.add(rStuDetails.getString(5));                   
                }
                
                while (i < sID.size()) 
                {
                	System.out.println("size:"+sID.size());
					System.out.println(sID.get(i));
					System.out.println(sFName.get(i));
					System.out.println(sLName.get(i));
					System.out.println(sAdd1.get(i));
					System.out.println(sAdd2.get(i));
					System.out.println("*****************");
					i++;
					
				}
                
                System.out.println("finsihed");
                
            }
        
        catch(Exception e)
            {
                System.out.println("Error in Data Connection :"+e);
                e.printStackTrace();
            }
	}
	
	
	
	
	
	
	public static void main(String[] args) throws NotOwnerException, Exception
	{
		Server_Comm.serverCode();		
		getStudentData();
		//createACL();
		//Client_Comm.clientSoc.close();
		
	}

}
