
/*  http://www.baeldung.com/a-guide-to-java-sockets */

import java.net.*;
import java.io.*;


public class EchoMultiServer {

    private ServerSocket serverSocket;
 
    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while (true)
            new EchoClientHandler(serverSocket.accept()).start();
    }
 
    public void stop() throws IOException {
        serverSocket.close();
    }
 
    private static class EchoClientHandler extends Thread {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
 
        public EchoClientHandler(Socket socket) {
            this.clientSocket = socket;
        }
 
        public void run() {
        	try {
	            out = new PrintWriter(clientSocket.getOutputStream(), true);
	            in = new BufferedReader(
	              new InputStreamReader(clientSocket.getInputStream()));
	             
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {
	                if (".".equals(inputLine)) {
	                    out.println("bye");
	                    break;
	                }
	                out.println(inputLine);
	            }
	 
	            in.close();
	            out.close();
	            clientSocket.close();
        	} catch ( IOException err ) { }
    	}
	}

   public static void main(String[] args) {
        EchoMultiServer server = new EchoMultiServer() ;
        try {
        	server.start(5050);
        } catch ( IOException err ) {
        	System.out.println( err ) ;
        }
    }

}

