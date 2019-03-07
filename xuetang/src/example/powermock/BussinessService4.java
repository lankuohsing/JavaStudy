package example.powermock;

public class BussinessService4 {
    public String testedMehtod(){
        ProcessDB4 processDB4 = ProcessDB4.getInstance();
        return processDB4.getResultOfConnectDB();
    }
}
