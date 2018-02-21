/**
 * Created by Cody on 3/23/2016.
 */
public class Point3D {
    //declare instance variables
    public double xPos;
    public double yPos;
    public double zPos;
    public double squared;
    //constructor
    public Point3D(double x, double y, double z){
        xPos = x;
        yPos = y;
        zPos = z;
    }
    //euclidian calculations
    private double distance(Point3D p1){
        double dx = (this.xPos - p1.xPos)*(this.xPos - p1.xPos);
        double dy = (this.yPos - p1.yPos)*(this.yPos - p1.yPos);
        double dz = (this.zPos - p1.zPos)*(this.zPos - p1.zPos);
        squared = dx + dy + dz;
        return Math.sqrt(squared);
    }
    //use the same calculation but leave off the sqrt
    private double distanceSquared(Point3D p1){
        double dx = (this.xPos - p1.xPos)*(this.xPos - p1.xPos);
        double dy = (this.yPos - p1.yPos)*(this.yPos - p1.yPos);
        double dz = (this.zPos - p1.zPos)*(this.zPos - p1.zPos);
        return squared = dx + dy + dz;
    }
    //create points and test methods
    public static void main(String[] args){
        Point3D p1 = new Point3D(30,45,20);
        Point3D p2 = new Point3D(50,6,14);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distanceSquared(p2));
    }
}
