package io_example_package.text_file_package;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester {
	public static void main(String[] args) {
		//main方法中声明抛出IO异常
		String fileName="newHello.txt";
		try {
//			FileWriter writer=new FileWriter(fileName,true);//true代表在已有的文件中追加
			BufferedWriter out=new BufferedWriter(new FileWriter(fileName));
			out.write("newHello!");
			out.newLine();
			out.write("This is another text file using BufferedWriter,");
			out.newLine();
			out.write("So I can use a commmon way to start a newline.\n");
			out.close();
		} catch (IOException iox) {
			// TODO: handle exception
			System.out.println("Problem writing "+fileName);
		}
		
	}
}
