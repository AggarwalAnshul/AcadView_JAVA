//Make a text file 'abc.txt' and write a path in
//it(say C:/Users/Test/video.mp4).Read the contents of the file and try to print the path from the file.

package assignment8;
import java.io.*;
import java.util.Scanner;

public class FileCreationAndReadingPath {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String filePath = "C:\\Bala Bala\\abc.txt";
		System.out.println("A program to create a file and read contents from it." + "\n");
		System.out.println("Trying to create a file abc.txt...");
		File file = new File(filePath);
		try {
				if( file.createNewFile() )
					System.out.println("\t" + "New File Creation successful !");
				else
					System.out.println("\t" + "File Already exists !");
				
				 //--------Writing the Path in the file
				 FileWriter fw = new FileWriter(filePath); 
				 System.out.println("Enter a Desired path to write in file or Press enter to use defualt path...");
				 String temp = sc.nextLine();
				 if (temp.isEmpty() ) //No path given by the user
					 {
					 	System.out.println("Trying to write the file's Absolute path in the file itself...");
					 	temp = file.getAbsolutePath();
					 	fw.write(temp);
					 	System.out.println("\t" + "File Writing operation Successful !");
					 }
				 else
				 {
					 System.out.println("Trying to write your defined path in the file...");
					 fw.write(temp);
					 System.out.println("\t" + "File Writing Operation Successful ! ");
				 }
				 fw.close();
				 System.out.println("Reading the contents of the file..." + "\n");
				 System.out.println("--------------------------------------------" + "\n");
				 FileReader fr = new FileReader(filePath);
				 int character; 
				 while( (character = fr.read() ) != -1 )
					 {
						System.out.print( (char)character ); 
					 }
				 fr.close();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}
}
