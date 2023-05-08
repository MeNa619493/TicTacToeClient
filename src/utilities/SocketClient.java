/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import controller.PushIpXmlClass;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;

/**
 *
 * @author moham
 */
public class SocketClient {
    private Socket mySocket;
    private DataInputStream dis;
    private PrintStream ps;
    private boolean isInitialized;
    static private SocketClient socketClient;
    

    static {
        socketClient = new SocketClient();
    }

    private SocketClient() {
        isInitialized = false;
    }

    static public SocketClient getInstance() {
        return socketClient;
    }

    public Socket getSocket() {
        if (!isInitialized) {
            try {
                mySocket = new Socket(PushIpXmlClass.ip, 5005);
                dis = new DataInputStream(mySocket.getInputStream());
                ps = new PrintStream(mySocket.getOutputStream());
                System.out.println("new Socket");
                isInitialized = true;
            } catch (IOException ex) {
            }
        }

        return mySocket;
    }

    public void closeSocket() {
        if (isInitialized) {
            try {
                dis.close();
                ps.close();
                mySocket.close();
                isInitialized = false;
                System.out.println("Socket is closed");
            } catch (IOException ex) {
            }
        }
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public DataInputStream getDataInputStream() {
        return dis;
    }

    public PrintStream getPrintStream() {
        return ps;
    }
}