package io_example_package.text_file_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyMaker {
	String sourceName,destName;
	BufferedReader source;
	BufferedWriter dest;
	String line;
	private boolean openFiles() {
		try {
			source=new BufferedReader(new FileReader(sourceName));
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem opening "+sourceName);
			return false;
		}
		try {
			dest=new BufferedWriter(new FileWriter(destName));
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem opening "+destName);
			return false;
		}
		return true;
	}
	private boolean copyFiles() {
		try {
			line=source.readLine();
			while (line!=null) {
				dest.write(line);
				dest.newLine();
				line=source.readLine();
			}
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem reading or writing ");
			return false;
		}
		return true;
	}
	private boolean closeFiles(){
		boolean retVal=true;
		try {
			source.close();
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem closing "+sourceName);
			retVal=false;
		}
		try {
			dest.close();
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem closing "+destName);
			retVal=false;
		}
		return retVal;
	}
	public boolean copy(String src,String dst) {
		sourceName=src;
		destName=dst;
		return openFiles()&&copyFiles()&&closeFiles();
	}
}
public class FileCopy{
	public static void main(String[] args) {
		if (args.length==2) {
			new CopyMaker().copy(args[0], args[1]);
			
			
		}
		else
		{
			System.out.println("Please Enter File names");
		}
	}
}
