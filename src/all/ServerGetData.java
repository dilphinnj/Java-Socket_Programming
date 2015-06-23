package all;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;


public class ServerGetData {
	
	public static void main(String args[]) throws ClassNotFoundException, IOException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException
	{
		Server_Comm serComm = new Server_Comm();
		serComm.serverCode();
		ObjectInputStream objIn = new ObjectInputStream(serComm.serverConctdSockt.getInputStream());
        ObjectOutputStream objOut = new ObjectOutputStream(serComm.serverConctdSockt.getOutputStream());
        
        SealedObject sobj = (SealedObject) objIn.readObject();
        EncryptData.decryptObject(sobj);
		
	}

}
