
/*  http://www.baeldung.com/a-guide-to-java-sockets */

import java.net.*;
import java.io.*;

public class EchoMultiClients {
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
        
        EchoMultiClients client1 = new EchoMultiClients();
        EchoMultiClients client2 = new EchoMultiClients();

        try {
        	client1.startConnection( "127.0.0.1", 5050 ) ;
        	client2.startConnection( "127.0.0.1", 5050 ) ;

        	String response1 = client1.sendMessage( "hello1" ) ;
        	System.out.println( response1 ) ;
      		String response10 = client2.sendMessage( "hello2" ) ;
        	System.out.println( response10 ) ;
            String response2 = client1.sendMessage( "world1" ) ;
            System.out.println( response2 ) ;
            String response20 = client2.sendMessage( "world2" ) ;
            System.out.println( response20 ) ;
            String response3 = client1.sendMessage( "." ) ;
            System.out.println( response3 ) ;
            String response30 = client2.sendMessage( "." ) ;
            System.out.println( response30 ) ;


        } catch ( IOException err ) {
        	System.out.println( err ) ;
        }
        finally {
        	client1.stopConnection() ;
        	client2.stopConnection() ;
        }

    }

}


