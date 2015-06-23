package all;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;



public class Client_Comm {
	
	String ServerAddress = "127.0.0.1";
	int portNo = 88;
	
	String username = "testServer";
	String password = "serverPass";
	
	public static Socket clientSoc;
	
	// Requirement 1
	
	public void createClientConn() throws ClassNotFoundException
	{
		
		
		try {
			
	// part A
			    clientSoc = new Socket(ServerAddress, portNo);
			    
    // part B
			    System.out.println("I am Client...Connected to "+ clientSoc.getRemoteSocketAddress());
			    ObjectOutputStream objOut = new ObjectOutputStream(clientSoc.getOutputStream());
			    System.out.println("My Socket address: " + clientSoc.getLocalSocketAddress());
			    objOut.writeObject(username );		
			    objOut.writeObject(password);	
			    //dataOut.writeUTF("Password is ::"+password);
	// part C
			    ObjectInputStream objIn = new ObjectInputStream(clientSoc.getInputStream());
			    System.out.println("Server response ::: " + objIn.readObject());
	
			    
			    
			}
		
		catch (IOException e) 
		    {
		        System.out.println("Error::=>"+e);
		        e.printStackTrace();
		    }
	}
	
	
	
	public static void main(String args[]) throws ClassNotFoundException, IOException
	{
		Client_Comm clientCode = new Client_Comm();
		clientCode.createClientConn();
		clientSoc.close();
	}
}
