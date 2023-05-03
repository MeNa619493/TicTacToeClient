/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Mina
 */
public class StreamHelper {
    private static File file;
    static String filePath = new File("C:/").getAbsolutePath();
    
    public static void createFile(String player1, String player2) {
        DateHelper c = new DateHelper();
        File dir = new File("C:\\Users\\Mina\\Documents\\NetBeansProjects\\TicTacToeClient\\src\\records");
        dir.mkdirs();
        file = new File(dir, String.format("%s vs %s %s.txt", player1, player2, c.getCurrentDateTime()));

        try {
            if(file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            System.err.println("Error creating file: " + ex.getMessage());
        }
    }
    
    public static void writeOnFile(String text) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(text);
            writer.flush();
            writer.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException ex) {
            System.err.println("Error writing text to file: " + ex.getMessage());
        }
    }
    
    public static String readFromFile(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("File content read successfully.");
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
        return data;   
    }
}
