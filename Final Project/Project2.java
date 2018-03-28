
/*Program to list all file and folder present in a given directory path*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Project2 {

	//Returns spaces per folder
	public static void space(int counter) {
		for (int i = 0; i < counter; i++) {
			System.out.print("\t");
		}
	}

	//The Meat Function
	public static ArrayList<String> finder(String path, int counter, ArrayList<String> arrayList) {
		counter += 1;
		File f = new File(path);
		File list[] = f.listFiles();
		for (File file : list) {
			if (file.isDirectory()) {
				arrayList.add("DETECTEDFOLDERXFX"+ counter + file.getName());
				//space(counter);
				//System.out.print(file.getName() + "\n");
				arrayList = finder(path + "\\" + file.getName(), counter, arrayList);
			} else {
				//space(counter);
				String tempName = file.getName();
				//System.out.print(tempName + "\n");
				arrayList.add("DETECTEDFOLDERXFX"+ counter + tempName); // added to the arrayList
			}
		}
		return arrayList;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<String> arrayList = new ArrayList<String>();

		System.out.println("A Program to explore Folders and files..." + "\n");
		
		System.out.println("Please Enter the path of the file must containing ");
		System.out.println("\t1. Path of the directory to explore");
		System.out.println("\t2. Path of the New File to be created" + "\n");
		
		//TASK 1: USER INPUTS FILE PATH CONTAINING THE DIRECTORY PATH
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		String directoryPath = "", csvPath= "";
		while ( path.isEmpty() ) 			
			{	System.out.println("No Path Specified, Please provide a valid path !");
				path = sc.nextLine();
			}
		
		//TASK 2: USER HAS PROVIDED THE FILE PATH, EXTRACTING DIRECTORY & CSV FILE PATH
				int character;
				FileReader fileReader = null;
				try
					{
						fileReader = new FileReader(path);
						while( (character = fileReader.read() ) != 10 && (character != -1) ) //Second Condition In case only 
								directoryPath += (char)character;					  		//Directory path is specified and no csvPath
						while( (character = fileReader.read() ) != -1 )
								csvPath += (char)character;
					}
				catch(IOException e)
					{
						//e.printStackTrace();
						System.out.println("\t" + "OOPS! Looks like we are lost . Please Contact support team or try Again." + "\n");
					}
				finally
					{
						try {
							fileReader.close();
						} catch (IOException e) {
							//e.printStackTrace();
						}
					}

		//TASK 3: PATH EXTRACTION COMPLETE, VALIDATING THE PATHS
		if( !directoryPath.isEmpty() )
			{	
				directoryPath = directoryPath.trim();
				if( csvPath.isEmpty() )
					csvPath = "C:";
				csvPath = csvPath.trim();
				csvPath += "\\ANSNARA_FILES\\Result.csv";
				
				//Creating the custom folder for CSV FILE
				File file = new File(csvPath);
				//Creates a Separate folder to store the result file
				if( file.getParentFile().mkdir() )
					{
						file.createNewFile();
					}
				
				
				//TASK 4: TRAVERSING THE DIRECTORY TO EXPLORE
				System.out.println("\n" + "Working on it...");
				arrayList.add("Explored Files & Folders in:     "+ directoryPath);	//The heading of the csv file
				arrayList.add("");
				arrayList = finder(directoryPath, 0, arrayList);
				
				//STEP 5: WRITING THE EXPLORED FILES & FOLDERS IN THE FILE
				Iterator<String> iterator = arrayList.iterator();
				FileWriter fileWriter = null;
				try {
					fileWriter = new FileWriter(csvPath);
				} catch (IOException e1) {
					//e1.printStackTrace();
					System.out.println("\t" + "OOPS! Looks like the Bridge is down. Please Contact Support");
				}
				while( iterator.hasNext() )
					{
						try {
							String temp = iterator.next();
							if( temp.contains("DETECTEDFOLDERXFX") ) //Logic, shifting columns in csv file for sub folder
								{									//For better graphical understanding of Hierarchy
									char spaceDigit = temp.charAt(17);
									String space = ""+spaceDigit;
									int spacex = Integer.parseInt(space);
									fileWriter.append('\n');		
									for(int i=1; i<spacex; i++)
										{
											fileWriter.append(',');
										}
									String replace = "DETECTEDFOLDERXFX" + spaceDigit;
									//System.out.println("REplace: "+replace);
									temp = temp.replace(replace, "");
									fileWriter.append(temp);
								}
							else
							{
								fileWriter.append(temp);
								fileWriter.append('\n');
							}
						} catch (IOException e) {
							//e.printStackTrace();
							System.out.println("\t" + "OOPS! Looks like We ran out of FUEL. Please Contact the support team...");
						}
					}
				System.out.println("Exploration Successfull !" + "\n");
				System.out.println("Check the Result Here: " + csvPath);
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("\t" + "OOPS! Looks like We ran out of FUEL. Please Contact the support team...");
				}
		
				sc.close();
			}
		//The specified file does not contain any path 
		else	
			{

				System.out.println("\n" + "Specified file is EMPTY ! ");
				System.out.println("Please Try again...");
			}
	}
}
