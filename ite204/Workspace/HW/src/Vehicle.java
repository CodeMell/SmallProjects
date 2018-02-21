
public class Vehicle {
    
    private String mfg;
    private int cylinders;
    
    public Vehicle(String mfg, int cylinders){
        this.mfg = mfg;
        this.cylinders = cylinders;
    }
    
    public Vehicle(){
        this("Ford", 4);
    }
    
    public String getMfg(){
        return this.mfg;
    }
    
    public int getCylinders(){
        return this.cylinders;
    }
    
    public boolean isEqual( Vehicle v){
        if(this.mfg == v.getMfg() && this.cylinders == v.getCylinders()){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return "This " + this.mfg + " has " + this.cylinders + " cylinders";
    }
}