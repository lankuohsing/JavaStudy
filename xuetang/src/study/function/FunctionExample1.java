package study.function;

import java.util.Arrays;

public class FunctionExample1 {
	static public String wordsArray[];
	static public void getSplitWords(String sentence) {
		String sentence1="lan guo xing";
		wordsArray=sentence1.split(" ");
	}
	public static void main(String[] args) {
		String sentence="xu juan ting";
		FunctionExample1.getSplitWords(sentence);
		System.out.println(Arrays.toString(FunctionExample1.wordsArray));
		String aString = "a";
		String bString = "a";
		System.out.println(aString.compareTo(bString));
		int a = 1;
		int b = 2;
	}
}
