import com.sedgewick.stdlib.*;
/**
 * Created by cody on 3/4/16.
 */
public class Squares {
    public static void drawSquare(double x, double y, double size){
        //create square with outline
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(x,y,size/2);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.circle(x,y,size/2);
    }
    public static void draw(int n, double x, double y, double size){
        if(n == 0) return;
        //draw main square
        drawSquare(x,y,size);
        double ratio = 2.2;
        //draw square on lower left corner
        draw(n-1,x-size/2, y-size/2,size/ratio);
        //draw square on upper left corner
        draw(n-1,x-size/2, y+size/2,size/ratio);
        //draw square on upper right corner
        draw(n-1,x+size/2, y+size/2,size/ratio);
        //draw square on lower right corner
        draw(n-1,x+size/2, y-size/2,size/ratio);
    }
    public static void main(String[] args){
        //get input
        int n = StdIn.readInt();
        double x = .5;
        double y = .5;
        double size = .5;
        //recursively draw squares
        draw(n,x,y,size);
    }
}
