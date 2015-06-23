package all;

import java.security.Principal;
import java.security.acl.Acl;
import java.security.acl.AclEntry;
import java.security.acl.Group;
import java.security.acl.NotOwnerException;
import java.security.acl.Permission;
import java.util.Enumeration;

import sun.security.acl.AclEntryImpl;
import sun.security.acl.AclImpl;
import sun.security.acl.GroupImpl;
import sun.security.acl.PermissionImpl;
import sun.security.acl.PrincipalImpl;

public class ACL {
	

	
	// Create ACL
	
	public static void createACL() throws NotOwnerException, Exception
	{
		Principal pr1 = new PrincipalImpl("user1"); 
	    Principal pr2 = new PrincipalImpl("user2"); 
	    Principal admin = new PrincipalImpl("owner"); 
	 
	    Permission read = new PermissionImpl("READ"); 
	    Permission write = new PermissionImpl("WRITE"); 
	 
	    Group grp = new GroupImpl("group1"); 
	    grp.addMember(admin);
	    grp.addMember(pr1); 
	    grp.addMember(pr2); 
	 
	    // 
	    // creating a new acl with the name "MyAcl" 
	    // 
	    Acl acl = new AclImpl(admin, "MyAcl"); 
	 
	    // 
	    // Allow group all permissions 
	    // 
	    AclEntry entry1 = new AclEntryImpl(grp); 
	    entry1.addPermission(read); 
	    entry1.addPermission(write); 
	    acl.addEntry(admin, entry1); 
	  
	 
	    // 
	    // Take away WRITE permissions for user1. All others in groups still have WRITE privileges. 
	    // 
	    AclEntry entry2 = new AclEntryImpl(pr1); 
	    entry2.addPermission(write); 
	    entry2.setNegativePermissions(); 
	    acl.addEntry(pr1, entry2);     
	    
	    // Take away READ permissions for user2. All others in groups still have READ privileges.
	    
	    AclEntry entry3 = new AclEntryImpl(grp); 
	    entry3.addPermission(write); 
	    entry3.setNegativePermissions(); 
	    acl.addEntry(pr2, entry2); 
	 
	    // 
	    // This enumeration is an enumeration of  Permission interfaces. It should return only "READ" permission. 
	    Enumeration e1 = acl.getPermissions(pr1); 
	 
	    // 
	    // This enumeration should have "READ" and"WRITE" permissions and contains permissions for user2. 
	    Enumeration e2 = acl.getPermissions(pr2); 
	    
	    Enumeration e3 = acl.getPermissions(admin); 
	 
	    // Permission list
	    boolean adm1 = acl.checkPermission(admin,write);
	    System.out.println("Admin have write privileges?" + adm1);
	    
	    boolean adm2 = acl.checkPermission(admin,read);
	    System.out.println("Admin have read privileges?" + adm2);
	    
	    boolean b0 = acl.checkPermission(pr1,write);
	    System.out.println("User1 have write privileges?" + b0);
	    
	    boolean b1 = acl.checkPermission(admin,write);
	    System.out.println("User1 have read privileges?" + b1);
	     
	    boolean b3 = acl.checkPermission(pr2,write);
	    System.out.println("User2 have write privileges?" + b3);
	    
	    boolean b4 = acl.checkPermission(pr2,write);
	    System.out.println("User1 have read privileges?" + b4);
	}

}
