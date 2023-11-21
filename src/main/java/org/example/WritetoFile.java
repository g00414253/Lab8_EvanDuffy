package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args){

        String filename = "File.14.txt";

        try ( FileWriter writer = new FileWriter(filename)) {
            writer.write("Finally got this working");
        }
        catch (IOException e){
            System.out.println("There was an issue with writing to file ");
            e.printStackTrace();
        }
    }
}
