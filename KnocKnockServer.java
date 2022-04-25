package OracleSocketExercise;
import java.io.*;
import java.net.*;

public class KnocKnockServer {
		
		public static void main(String[] args) throws IOException{
			 
			if(args.length != 1) {
				System.out.println("Usage : java KnocKnockServer <port number>");
				System.exit(1);
			}
			
			int portNumber = Integer.parseInt(args[0]);
			
			try(    
					//establishing a serverSocket
					ServerSocket serverSocket = new ServerSocket(portNumber);
					// the serverSocket accepting and establishing the connection with the client socket
				     Socket clientSocket = serverSocket.accept();
					 
					PrintWriter out =
							new PrintWriter(clientSocket.getOutputStream(),true);
					
					BufferedReader in =  new BufferedReader(
							new InputStreamReader(clientSocket.getInputStream()));
					) 
			{
				String inputLine, outputLine;
				
				//Initiate conversation with client
				KnockKnockProtocol kkp = new KnockKnockProtocol();
				outputLine = kkp.processInput(null);
				out.println(outputLine);
				
				while((inputLine = in.readLine()) != null) {
					outputLine = kkp.processInput(inputLine);
					out.println(outputLine);
					
					if(outputLine.equals("Bye."))
						break;	
				}
			}
			catch(IOException e) {
				System.out.println("Exception caught when trying to listen to port" + portNumber + "or Listening for a connection");
				System.out.println(e.getMessage());
			}
		}
}
