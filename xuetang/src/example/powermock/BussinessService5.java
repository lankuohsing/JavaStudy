package example.powermock;

public class BussinessService5 {
    public String testedMehtod(){
        ProcessDB processDB = new ProcessDB();
        return processDB.getResultOfConnectDB();
    }
}
