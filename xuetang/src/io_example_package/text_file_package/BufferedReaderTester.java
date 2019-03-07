package io_example_package.text_file_package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTester {
	public static void main(String[] args) {
		String fileName="Hello.txt",line;
		try {
			BufferedReader in =new BufferedReader(new FileReader(fileName));
			line=in.readLine();
			while (line!=null) {
				System.out.println(line);
				line=in.readLine();
			}
			
			/*int c;
			while ((c=in.read())!=-1) {
				System.out.println((char)c);

			}*/
			in.close();
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem reading "+fileName);
		}
	}
}
