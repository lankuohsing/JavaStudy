package example.powermock;

public class BussinessService3 {
    public String testedMehtod(){
        ProcessDB processDB = new ProcessDB();
        return processDB.getResultOfConnectDB();
    }
}
