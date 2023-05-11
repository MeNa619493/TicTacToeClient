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
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Mina
 */
public class SocketHelper {

    private Socket serverSocket;
    private DataInputStream dis;
    private PrintStream ps;
    private String ipAddress = PushIpXmlClass.ip;
    public static SocketHelper instance;

    private SocketHelper() {
        intializeSocket();
    }

    public static synchronized SocketHelper getInstance() {
        if (instance == null) {
            instance = new SocketHelper();
        }

        return instance;
    }

    public void intializeSocket() {
        try {
            serverSocket = new Socket(ipAddress, 5005);
            dis = new DataInputStream(serverSocket.getInputStream());
            ps = new PrintStream(serverSocket.getOutputStream());
            System.out.println("new Socket");
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void closeSocket() {
        try {
            if (serverSocket != null) {
                dis.close();
                ps.close();
                serverSocket.close();
                instance = null;
                System.out.println("Socket is closed");
            }
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
