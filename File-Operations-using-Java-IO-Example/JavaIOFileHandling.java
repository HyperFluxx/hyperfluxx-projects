import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Character;
public class JavaIOFileHandling {
    private Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Do you want to handle an existing file? Y/N:-");
        char choice=input.next().charAt(0);
        choice = Character.toUpperCase(choice);
        if (choice == 'Y') {
            System.out.println("Enter file path :-");
            String filepath=input.nextLine();
            File myFile=new File(filepath);
            String filename=myFile.getName();
            String absolutepath=myFile.getAbsolutePath();
            boolean writeable=myFile.canWrite();
            int filelength= (int) myFile.length();
            boolean readable=myFile.canRead();
            System.out.println("What do you want to do with this file : "+filename);
            System.out.println("1. Properties");
            System.out.println("2. Read");
            System.out.println("3. Write");
            System.out.println("4. Delete");
            System.out.println("Enter via Serial Number of choice :-");
            int option=input.nextInt();
            if (option==1) {
                System.out.println("File Name : " + filename);
                System.out.println("Absolute Path : " + absolutepath);
                System.out.println("Writeable : " + writeable);
                System.out.println("Readable : " + readable);
                System.out.println("File Size in Bytes : " + filelength);
            }
            if (option==2) {
                char[] readarray=new char[filelength];
                System.out.println("Initializing File Reading...");
                FileReader reading=new FileReader(filepath);
                reading.read(readarray);
                System.out.println("The file reads as :-");
                System.out.println(readarray);
                reading.close();
            }
            if (option==3) {
                System.out.println("Initializing File Writing...");
                FileWriter fw = new FileWriter(filepath);
                System.out.println("Enter lines to be written:-");
                String writelines = input.nextLine();
                fw.write(writelines);
                fw.close();
                System.out.println("File Write success!");
            }
            if (option==4) {
                if (myFile.delete()) {
                    System.out.println("Deleted the file : " + filename);
                } else {
                    System.out.println("Failed to delete file");
                }
            }
        }
        if (choice=='N') {
            System.out.println("Enter path of new file to be created :-");
            String filepath=input.nextLine();
            File myFile=new File(filepath);
            String filename=myFile.getName();
            if (myFile.createNewFile()) System.out.println("File creation success!");
            else System.out.println("Failed to create new file");
            String absolutepath=myFile.getAbsolutePath();
            boolean writeable=myFile.canWrite();
            int filelength= (int) myFile.length();
            boolean readable=myFile.canRead();
            System.out.println("What do you want to do with this file : "+filename);
            System.out.println("1. Properties");
            System.out.println("2. Read");
            System.out.println("3. Write");
            System.out.println("4. Delete");
            System.out.println("Enter via Serial Number of choice :-");
            int option=input.nextInt();
            if (option==1) {
                System.out.println("File Name : " + filename);
                System.out.println("Absolute Path : " + absolutepath);
                System.out.println("Writeable : " + writeable);
                System.out.println("Readable : " + readable);
                System.out.println("File Size in Bytes : " + filelength);
            }
            if (option==2) {
                char[] readarray=new char[filelength];
                System.out.println("Initializing File Reading...");
                FileReader reading=new FileReader(filepath);
                reading.read(readarray);
                System.out.println("The file reads as :-");
                System.out.println(readarray);
                reading.close();
            }
            if (option==3) {
                System.out.println("Initializing File Writing...");
                FileWriter fw = new FileWriter(filepath);
                System.out.println("Enter lines to be written:-");
                String writelines = input.nextLine();
                fw.write(writelines);
                fw.close();
                System.out.println("File Write success!");
            }
            if (option==4) {
                if (myFile.delete()) {
                    System.out.println("Deleted the file : " + filename);
                } else {
                    System.out.println("Failed to delete file");
                }
            }
        }
    }
}
