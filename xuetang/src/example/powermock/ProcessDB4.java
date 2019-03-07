package example.powermock;

public class ProcessDB4 {
    public static ProcessDB4 getInstance(){
        return new ProcessDB4();
    }
    public String getResultOfConnectDB() {
        
        return "haha, Really went to the database";
    }

}
