
/*  http://www.baeldung.com/a-guide-to-java-sockets */


import java.net.*;
import java.io.*;

public class GreetClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
 
    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
 
    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }
 
    public void stopConnection() {
    	try {
        	in.close();
        	out.close();
        	clientSocket.close();
        } catch ( IOException err ) {}
    }

    public static void main(String[] args) {
        GreetClient client = new GreetClient();
        try {
        	client.startConnection( "127.0.0.1", 9090 ) ;
        	String response = client.sendMessage( "hello server" ) ;
        	System.out.println( response ) ;
        } catch ( IOException err ) {
        	System.out.println( err ) ;
        }
        finally {
        	client.stopConnection() ;
        }

    }

}


