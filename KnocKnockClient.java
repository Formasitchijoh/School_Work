package OracleSocketExercise;
import java.io.*;
import java.net.*;

public class KnocKnockClient {
  public static void main(String[] args) {
	  
	  /*
	   * the length of the commandline argument is
	   * expected to be equal to two since the KnockKnockclient 
	   * Socket take two arguments
	   */
	  
	  if(args.length != 2) {
		  System.out.println("Usage: java EchoClient <host name> <port number>");
		  System.exit(1);
	  }
	  
	  String hostName = args[0];
	  int portNumber = Integer.parseInt(args[1]);
	  
	  try (
			  Socket kkSocket = new Socket(hostName, portNumber); 
			 
			  /*
			   * 
			   * PrintWriter writes formatted representation of Object
			   *  to a text-output stream
			   */
			  PrintWriter out = 
					  new PrintWriter(kkSocket.getOutputStream(),true);
			  BufferedReader in = new BufferedReader(
					 new BufferedReader(new InputStreamReader(kkSocket.getInputStream())));
					 ) {
					  /*
					   * Reads text from a character-input stream, buffering characters
					   *  so as to provide for the efficient reading of characters , arrays and lines
					   */
					  BufferedReader stdIn = 
					  new BufferedReader(new InputStreamReader(System.in));
			         
				      String fromServer;
				  String fromUser;
			    
			  while((fromServer = in.readLine()) != null) {
				  System.out.println("Server: " + fromServer);
				  if(fromServer.equals("Bye"))
					  break;
				 
				  fromUser = stdIn.readLine();
				  if(fromUser != null) {
					  System.out.println("Client: " + fromUser);
					  out.println(fromUser);
				  }
			  }
		} catch(UnknownHostException e) {
			System.err.println("Dont know about host " + hostName);
			System.exit(1);
			
		} catch(IOException e) {
			System.err.println("Couldn't get I/O for the connection to " + hostName);
			System.exit(1);
		}
  }
}
