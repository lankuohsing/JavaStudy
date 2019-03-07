package class_study_package;

public class BankAccount {
	private String ownerName;
	private int accountNumber;
	private float balance;
	public BankAccount(){
		this("",0,0);
	}
	public BankAccount(String initName,int initAccNum,float initBal){
		ownerName=initName;
		accountNumber=initAccNum;
		balance=initBal;
	}
	public String getOwnerName(){return ownerName;}
	public int getAccountNumber() {return accountNumber;	}
	public float getBalance(){return balance;}
	public void setOwnerName(String newName) {
		ownerName=newName;
	}
	public void setAccountNumber(int newNum) {
		accountNumber=newNum;
	}
	public void setBalance(float newBalance) {
		balance=newBalance;
	}
	public String toString() {
		return ("Account #"+accountNumber+" with balance "+
	new java.text.DecimalFormat("$0.00").format(balance));
	}
	public float deposit(float anAmount) {
		balance+=anAmount;
		return(balance);
	}
	public float withdraw(float anAmount) {
		balance-=anAmount;
		return(balance);
	}
	/*使用类方法生产特殊的实例*/
	public static BankAccount example1() {
		BankAccount ba=new BankAccount();
		ba.setOwnerName("LiHong");
		ba.setAccountNumber(554000);
		ba.deposit(1000);
		return ba;
	}
	public static BankAccount example2() {
		BankAccount ba=new BankAccount();
		ba.setOwnerName("ZhaoWei");
		ba.setAccountNumber(554001);
		ba.deposit(1000);
		ba.deposit(2000);
		return ba;
	}
	public static BankAccount emptyAccountExample() {
		BankAccount ba=new BankAccount();
		ba.setOwnerName("HeLi");
		ba.setAccountNumber(554002);
		return ba;
	}
}
