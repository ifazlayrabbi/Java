package packages;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFile {
  public static void main (String[] args) {
    
    /////////////////////  File Create  /////////////////////////
    // File file = new File ("file1.txt");
    // try {file.createNewFile();} catch (IOException err) {System.out.println(err);}



    /////////////////////  File Write  //////////////////////////
    try {
      FileWriter fileWriter = new FileWriter("file1.txt");
      fileWriter.write("Hello, Rahim. \nHi, Rahim.");
      fileWriter.close();
    } 
    catch (IOException err) {System.out.println(err);}



    /////////////////////  File Read  ////////////////////////
    // File file = new File("file1.txt");
    // try {
    //   Scanner scan = new Scanner(file);
    //   while (scan.hasNextLine()) {
    //     System.out.println(scan.nextLine());
    //   }
    //   scan.close();
    // }
    // catch(FileNotFoundException err) {err.printStackTrace();}



    ////////////////////  File Delete  ////////////////////////
    // File file = new File("file1.txt");
    // if(file.delete())
    //   System.out.println("File Deleted.");
    // else
    //   System.out.println("File not Deleted.");
    
  }
}

