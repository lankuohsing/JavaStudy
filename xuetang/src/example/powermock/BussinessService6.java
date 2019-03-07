package example.powermock;

public class BussinessService6 {
    public String testedMehtod(){
        ProcessDB processDB = new ProcessDB();
        return processDB.getResultOfConnectDB();
    }
}
