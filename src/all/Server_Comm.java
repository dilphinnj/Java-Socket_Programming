package all;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;



public class Server_Comm {
	
	public static int portNo = 88;
	public static Socket serverConctdSockt;

	public static void serverCode() throws IOException, ClassNotFoundException
	{
		ServerSocket serverMainSocket = new ServerSocket(portNo);
		String serverUserName = "testServer";
		String serverPassword = "serverPass";
		
        try{
        		System.out.println("I am Server....Waiting for client port connection " + serverMainSocket.getLocalPort() + "...");
	            serverConctdSockt = serverMainSocket.accept();
	            System.out.println("Connected to "+ serverConctdSockt.getRemoteSocketAddress());
	            ObjectInputStream objIn = new ObjectInputStream(serverConctdSockt.getInputStream());
	            ObjectOutputStream objOut = new ObjectOutputStream(serverConctdSockt.getOutputStream());
	            
	            
	            
	            //PrintStream printOS = new PrintStream(serverConctdSockt.getOutputStream());
	           /* while (objIn == null) {
	            	System.out.println(objIn.readObject());
					
				}*/
	            /*System.out.println(objIn.readObject());
	            System.out.println(objIn.readObject());*/
	            
	           
	            String clientUserName = (String) objIn.readObject();
	            System.out.println(clientUserName);
//	            System.out.println(in.readLine()); 
//             
	            String clientPassword = (String) objIn.readObject();
	            System.out.println(clientPassword);
	            
	          
	            if(clientUserName.equals(serverUserName) && clientPassword.equals(serverPassword))
	            {
	            	objOut.writeObject("Successfully Logged into server!");
	            }
	            
	            else
	            {
	            	objOut.writeObject("Incorrect password!");
	            	serverMainSocket.close();
	            }
	            
	            
	         }
        
        	 catch(SocketTimeoutException s)
	         {
	            System.out.println("Socket timed out! =>"+s);
	            
	         }
        	 catch(IOException e)
	         {
        		System.out.println("Error::=>"+e);
	            e.printStackTrace();
	            
	         }
        
        finally
        {
        	//serverConctdSockt.close();
        	serverMainSocket.close();
        }
	      
	}
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		serverCode();
	}
	
	
}
