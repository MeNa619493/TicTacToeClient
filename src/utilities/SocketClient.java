/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author moham
 */
public class SocketClient {
    private Socket mySocket;
  
    private boolean isInitialized;
    static private SocketClient socketClient ;
    static {
        socketClient = new SocketClient();
    }
    
    private SocketClient() {
       
            isInitialized=false;
       
    }
    
    static  public SocketClient getInstant(){
       return  socketClient;
    }
 
    public Socket getSocket()  {
        if(!isInitialized){
            try {
                mySocket = new Socket("127.0.0.1", 5005);
                
                isInitialized = true;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                
            }
          
        }

        return  mySocket;
    }
    public void CloseSocket() throws IOException{
        if(isInitialized){
            mySocket.close();
            isInitialized = false;
            
        }
              
    }

    public boolean isIsInitialized() {
        return isInitialized;
    }
    
    
}
