package all;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.SealedObject;
public class SendDataToServer {

	public static void main(String args[]) throws Exception
	{
		//EncryptData edata1 = new EncryptData();
		StudentMarks stuMark = new StudentMarks();
		Client_Comm clCom = new Client_Comm();
		
		stuMark.serialize(3, 4, 45, 45, 90);
		SealedObject sobj1 = EncryptData.encryptObject(stuMark);	
		clCom.createClientConn();
		ObjectOutputStream objOut = new ObjectOutputStream(Client_Comm.clientSoc.getOutputStream());
	    System.out.println("My Socket address: " + Client_Comm.clientSoc.getLocalSocketAddress());
	    objOut.writeObject(sobj1);
	    ObjectInputStream objIn = new ObjectInputStream(Client_Comm.clientSoc.getInputStream());
	    System.out.println("Server response ::: " + objIn.readObject());
	    Client_Comm.clientSoc.close();
	}
}
