package com.main.InputOutput;

import java.io.*;

public class ioIntro {

    public static void main(String[] args) {

        String infileName = "/home/cyn/Documents/inputIO.txt";
        File infile = new File(infileName);
        String outfileName = "/home/cyn/Documents/outputIO.txt";
        File outfile = new File(outfileName);

        try(BufferedReader in = new BufferedReader(new FileReader(infile));
                PrintWriter out = new PrintWriter(outfile)){
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.println();
            }

        } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }

    }


    private static void closeReader(Reader reader) {

        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}

/*
 String filename = File.separator + "home" + File.separator + "cyn" + File.separator +
                "Documents" + File.separator + "testIO.txt";
 */


/*
     BufferedReader in = null;
     try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
 */

/*
       PrintWriter out = null;

        try{
            out = new PrintWriter(file);
            out.write("I/O Writer SimpleJava");

        }catch (FileNotFoundException ex) {
            System.out.println("Cannot write to file " + file + ".");
        }finally{
            out.close();
        }
 */







