package OracleSocketExercise;
import java.io.*;
import java.net.*;

public class EchoClient {
		
	public static void main(String[] args) throws IOException {
		
		if(args.length != 2) {
			System.err.println(
					"Usage java EchoClient <host name> <port number>");
			System.exit(1);
		}
		
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);
		
		try (
				Socket echoSocket = new Socket(hostName, portNumber);//Creates a socket with a hostName and a portName
				PrintWriter out =
						new PrintWriter(echoSocket.getOutputStream(),true);//gets output from the client socket port
				BufferedReader in = 
						new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
				BufferedReader stdIn =
						new BufferedReader(new InputStreamReader(System.in))
						
				) {
					String userInput;
					while((userInput = stdIn.readLine()) != null) {
						//using the BufferedReader stdIn to read from System.in using readLine() function
						out.println(userInput);
						System.out.println("echo: " + in.read());
					}
		        } 
					catch(UnknownHostException e) {
						System.err.println("Dont know about host" + hostName);
						System.exit(1);
					}
						
						catch(IOException e) {
							System.err.println("Couldn't get I/O for the connection to " + hostName);
							System.exit(1);
						}
		}
}
