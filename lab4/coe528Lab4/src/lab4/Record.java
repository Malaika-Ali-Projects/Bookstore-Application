/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Malaika
 */
public class Record {
// Name of the associated file

    private String filename;

    public Record(String n) {
        filename = n;
    }
// Effects: Reads and prints the contents of the associated
// file to the standard output.

    public void read() {

        try {
// Write the code here
            Scanner scanner = new Scanner(new FileReader(filename));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Effects: Appends the specified message, msg, to the
// associated file.
    public void write(String msg) {
        try {
// Write the code here
            FileWriter writer = new FileWriter(filename, true);
            writer.write(msg);
            writer.close();
            
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = new Record("record.txt");
// Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt "
                + "contains the following lines:");
        r.read();
    }

}
