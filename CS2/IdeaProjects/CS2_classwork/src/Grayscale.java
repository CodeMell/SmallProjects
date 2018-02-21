/******************************************************************************
 *
 *
 *  Reads in an image from a file, converts it to grayscale, and
 *  displays it on the screen.
 *
 *
 *
 ******************************************************************************/

        import com.sedgewick.stdlib.In;
        import com.sedgewick.stdlib.Picture;

        import java.awt.Color;

public class Grayscale {

    public static void main(String[] args) {
      //In in=new In("/Users/iSirin/Documents/cs2Spring2016/cs2Examples/cs2CourseExamples/data/darwin.jpg");
String filename ="/media/removable/USB Drive/Computer Science/CS2/IdeaProjects/CS2_classwork/data/cat.jpg";
        Picture pic = new Picture(filename);
        int width  = pic.width();
        int height = pic.height();

        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = pic.get(col, row);
                Color gray = Luminance.toGray(color);
                pic.set(col, row, gray);
            }
        }
        pic.show();
    }

}

