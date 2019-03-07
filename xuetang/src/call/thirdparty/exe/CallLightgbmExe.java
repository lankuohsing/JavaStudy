package call.thirdparty.exe;

public class CallLightgbmExe {
	public static void main(String[] args) {
		try {
	         String cmdStr1="D:\\Projects\\eclipse\\DMRanking\\lightgbm.exe config=D:\\Projects\\eclipse\\DMRanking\\16k_data0.conf";
	        
	         
	         Runtime.getRuntime().exec("cmd.exe /c start "+cmdStr1);
	     }catch(Exception e){
	         e.printStackTrace();
	     }
	}
}
