package io_example_package;
/*
 * copy from a file into another file
 */
import java.io.*;


public class Redirecting {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in =new BufferedInputStream(new FileInputStream("D:\\Projects\\github\\JavaStudy\\xuetang\\src\\io_example_package\\Redirecting.java"));
		PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("D:\\Projects\\github\\JavaStudy\\xuetang\\src\\io_example_package\\test.out")));
		System.out.println(in);
		System.out.println(out);
		System.setErr(out);
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		String s;
		while ((s=br.readLine())!=null) {
			System.out.println(1);
			out.println(s);
			
		}
		
		in.close();
		out.flush();
		out.close();
	}
}
