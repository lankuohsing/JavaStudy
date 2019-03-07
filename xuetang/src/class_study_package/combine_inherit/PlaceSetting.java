package class_study_package.combine_inherit;
class Plate{
	public Plate(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Plate constructor");
	}
}
class DinnerPlate extends Plate{
	public DinnerPlate(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}
class Utensil{
	public Utensil(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Utensil constructor");
	}
}
class Spoon extends Utensil{
	public Spoon(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Spoon constructor");
	}
}
class Fork extends Utensil{
	public Fork(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Fork constructor");
	}
}
class Knife extends Utensil{
	public Knife(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Knife constructor");
	}
}
class Custom{
	public Custom(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Custom constructor");
	}
}
public class PlaceSetting extends Custom{
	Spoon spoon;
	Fork fork;
	Knife knife;
	DinnerPlate dinnerPlate;
	public PlaceSetting(int i) {
		// TODO Auto-generated constructor stub
		super(i+1);
		spoon=new Spoon(i+2);
		fork=new Fork(i+3);
		knife=new Knife(i+4);
		dinnerPlate=new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}
	public static void main(String[] args) {
		PlaceSetting placeSetting=new PlaceSetting(9);
	}
	
}
