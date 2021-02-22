package com.main.OracleExamples;

import java.io.*;
import java.util.Vector;

// Handling exceptions

public class ListOfNumbers {

    private Vector<Integer> victor;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        victor = new Vector<>(SIZE);
        this.readList("infile.txt");
        this.writeList();
    }

    // This method should read in int values from a file, print each value,
    // and append them to the end of the vector
    public void readList(String fileName) {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
//                System.out.println(i);
                victor.addElement(i);
            }
        } catch(FileNotFoundException fnf) {
            System.err.println("File: " + fileName + " not found.");
        } catch (IOException io) {
            System.err.println(io.toString());
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < victor.size(); i++)
                out.println("Value at: " + i + " = " + victor.elementAt(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers();
    }

}
