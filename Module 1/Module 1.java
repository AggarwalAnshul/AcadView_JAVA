import java.io.*;
import java.util.Scanner;

public class Assignment1 
  {	public static void main(String[] args)
	 {
		String path;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the path of the file");
		path = sc.nextLine();
		while(path.isEmpty())  //Empty path protection
		  { 
			System.out.println("Null path detected ! \nEnter again...");
			path = sc.nextLine();
		  }
			
	    try 
	      {
				FileReader fr = new FileReader(path);
				int character;
				System.out.println("Contents of the file: \n");
				while ( (character = fr.read()) != -1 )
					System.out.print((char) character);
				fr.close();
		  } 
	    catch (IOException e) 
	      {
				System.out.println("Exception occured !");
				e.printStackTrace();
		  }
	    sc.close();
	 }
  }
