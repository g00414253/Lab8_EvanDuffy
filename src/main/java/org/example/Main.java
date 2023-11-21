package org.example;

import java.io.File;
import java.io.IOException;

 class CreateFile {

    public static void main(String[] args) {

        //Specify the file name
        String fileName ="File.13.txt";

        File myFile = new File(fileName);

        try {
            //Create a new file onb the disk
            if (myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        }catch(IOException e){
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }
    }
}