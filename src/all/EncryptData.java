package all;

import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;

public class EncryptData {
	
	 private static Cipher encipher;
	 private static Cipher dcipher;
	 private static SecretKey key;	 
	 //private static SealedObject sealObj; 
	 
	 		 
	 public static SealedObject encryptObject(StudentMarks smark) throws Exception
	 {
		 SealedObject sealObj;
		 
		// generate secret key using DES algorithm
		 key = KeyGenerator.getInstance("DES").generateKey();
		 encipher = Cipher.getInstance("DES");
		 
		 
		 // initialize the ciphers with the given key
		   encipher.init(Cipher.ENCRYPT_MODE, key);
		   
		   
		   // create a sealed object
		   sealObj = new SealedObject(new SecretObject(smark), encipher);
		   
		   // get the algorithm with the object has been sealed
		   String algorithm = sealObj.getAlgorithm();
		   System.out.println("Algorithm " + algorithm);
		   
		   
		return sealObj;

	 }
	 
	 
	 public static void decryptObject(SealedObject sealObj) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException
	 {
		dcipher = Cipher.getInstance("DES");
		dcipher.init(Cipher.DECRYPT_MODE, key);
		 
		try 
		{ 
			 SecretObject sObj = (SecretObject) sealObj.getObject(dcipher);
			 System.out.println("Original Object: " + sObj);
			 StudentMarks sm =  sObj.returnOriginalObject();
			 sm.deserialize();
			// System.out.println("Data::==>"+sm.deserialize());
		 }
	 
	 
		         catch (BadPaddingException e) {
		             System.out.println("Bad Padding:" + e.getMessage());		
		             return;		         
		         }
		         
		         
		         catch (IllegalBlockSizeException e) {
		             System.out.println("Illegal Block:" + e.getMessage());
		             return;
		         }
		         
		         
		         catch (ClassNotFoundException e) {
		             System.out.println("Class Not Found:" + e.getMessage());
		             return;
		         }
		         
		         
		         catch (IOException e) {
		             System.out.println("I/O Error:" + e.getMessage());
		             return;
		         }
		
	 }
	 
	 
	 
	 
	 public static class SecretObject implements Serializable 
	 {
		 //private static final long serialVersionUID = -1335351770906357695L;
		// private final String message;
		 
		 private StudentMarks smObj;
		 
		 public SecretObject(StudentMarks smo) 
		 
		 {
		      this.smObj = smo;
		 }
		 
		 public StudentMarks returnOriginalObject() 
		 	{
		     	return smObj;
		    }
		 
	  }
	 
	 
	 //Testing

	/* public static void main(String args[]) throws Exception
	 {
		 StudentMarks smark1 = new StudentMarks();
		 smark1.serialize(3, 4, 45, 45, 90);
		 SealedObject sobj1 = encryptObject(smark1);		 	 
		 decryptObject(sobj1);
		// smark1.deserialize();
	 }*/
	 
	 

	
	 

}
