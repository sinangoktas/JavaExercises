package com.main.Advanced_Input_Output.binaryInputOutput;

import java.io.*;
import java.util.Scanner;

public class CeasarDecryptor {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input file: ");
        String inFile = in.next();
        System.out.print("Output file: ");
        String outFile = in.next();
        System.out.print("Decryption key: ");
        int key = in.nextInt();

        try (InputStream inStream = new FileInputStream(inFile);
             OutputStream outStream = new FileOutputStream(outFile))
        {
            CaesarCipher cipher = new CaesarCipher(key);
            cipher.decryptStream(inStream, outStream);
        }
        catch (IOException exception)
        {
            System.out.println("Error processing file: " + exception);
        }

    }
}
