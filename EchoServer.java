package OracleSocketExercise;
import java.net.*;
import java.io.*;


public class EchoServer {
		
	public static void main(String[] args) throws IOException {
		
		if(args.length != 1) {
			System.err.println("Usage: java EchoServer <port name> ");
			System.exit(1);
		}
		
		int portNumber = Integer.parseInt(args[0]);
		
		try (
				ServerSocket serverSocket =
				new ServerSocket(Integer.parseInt(args[0]));//creating the sever socket
				Socket clientSocket = serverSocket.accept(); //server accept the request from the client
				
				PrintWriter out = 
						new PrintWriter(clientSocket.getOutputStream(),true);
				
				BufferedReader in  = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
				) {
			 		String inputLine;
			 		while((inputLine = in.readLine()) !=null) {
			 			out.println(inputLine);
			 		}
		     }  
				catch(IOException e) {
					System.out.println("Exception caught when trying to listen to port " + portNumber +"or listening for a connection");
					System.out.println(e.getMessage());
				}
	       }
}
