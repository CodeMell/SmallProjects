
public class TestVehicle{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        
        System.out.println(v1);
        System.out.println(v2);
        
        if(v1.isEqual(v2)){
            System.out.println("Vehicles are equal");
        }else{
            System.out.println("Vehicles are not equal");
        }
        
        Truck t1 = new Truck("Chevrolet", 4, 35.0);
        Truck t2 = new Truck("Ram", 6, 40.0);
        
        System.out.println(t1);
        System.out.println(t2);
        
         if(t1.isEqual(t2)){
            System.out.println("Trucks are equal");
        }else{
            System.out.println("Trucks are not equal");
        }

    }
}