/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Mina
 */
public class SocketHelper {

    private Socket serverSocket;
    private DataInputStream dis;
    private PrintStream ps;
    static public SocketHelper instance;

    private SocketHelper() {
        intializeSocket();
    }

    public static synchronized SocketHelper getInstance() {
        if (instance == null){
            instance = new SocketHelper();
        }
       
        return instance;
    }

    public void intializeSocket() {
        try {
            serverSocket = new Socket("127.0.0.1", 5005);
            dis = new DataInputStream(serverSocket.getInputStream());
            ps = new PrintStream(serverSocket.getOutputStream());
            System.out.println("new Socket");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void closeSocket() {
        try {
            dis.close();
            ps.close();
            serverSocket.close();
            instance = null;
            System.out.println("Socket is closed");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Socket getServerSocket() {
        return serverSocket;
    }

    public DataInputStream getDataInputStream() {
        return dis;
    }

    public PrintStream getPrintStream() {
        return ps;
    }
}
