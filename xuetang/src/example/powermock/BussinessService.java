package example.powermock;

public class BussinessService {
private ProcessDB processDB;
    
    public BussinessService(ProcessDB db){
        this.processDB = db;
    }
    public String testedMehtod(){
        return processDB.getResultOfConnectDB();
    }

}
