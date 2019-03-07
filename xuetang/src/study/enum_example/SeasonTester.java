package study.enum_example;

public class SeasonTester {
	public static void main(String[] args) {
		Season season1=Season.Spring;
		System.out.println(season1);
		season1=Season.Summer;
		System.out.println(season1);
		if (season1==Season.Summer) {
			System.out.println("season1 is "+Season.Summer);
		}
	}
}
