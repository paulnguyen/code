
/*  http://www.baeldung.com/a-guide-to-java-sockets */

import java.net.*;
import java.io.*;

public class EchoClient {
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
        EchoClient client = new EchoClient();
        try {
        	client.startConnection( "127.0.0.1", 4040 ) ;

        	String response1 = client.sendMessage( "hello" ) ;
        	System.out.println( response1 ) ;
            String response2 = client.sendMessage( "world" ) ;
            System.out.println( response2 ) ;
            String response3 = client.sendMessage( "." ) ;
            System.out.println( response3 ) ;


        } catch ( IOException err ) {
        	System.out.println( err ) ;
        }
        finally {
        	client.stopConnection() ;
        }

    }

}


