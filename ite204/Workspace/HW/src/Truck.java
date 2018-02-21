
public class Truck extends Vehicle{
    
    double loadcap;
    
    public Truck(String mfg, int cylinders, double loadcap){
        super(mfg, cylinders);
        this.loadcap = loadcap;
    }
    
    public Truck(){
        super();
        this.loadcap = 20.0;
    }
    
    public double getLoadCap(){
        return this.loadcap;
    }
    
    public double getTowCap(){
        return this.loadcap / this.getCylinders();
    }
    
    public boolean isEqual( Truck t){
        if (super.isEqual(t) && this.loadcap == t.getLoadCap()){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return super.toString() + ", a load capacity of " + this.loadcap + " and a towing capacity of " + this.getTowCap();
    }
}