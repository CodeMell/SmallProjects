/**
 * Created by iSirin on 2/23/16.
 */

import com.sedgewick.stdlib.Picture;
import com.sedgewick.stdlib.StdIn;

import java.awt.Color;

public class Scale {
    public static void main(String[] args) {
        String filename  ="/Users/iSirin/Documents/cs2Spring2016/cs2Examples/cs2CourseExamples/data/mandrill.jpg";

        int w = StdIn.readInt();
        int h = StdIn.readInt();
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);

        for (int tx = 0; tx < w; tx++) {
            for (int ty = 0; ty < h; ty++) {
                int sx = tx * source.width()  / w;
                int sy = ty * source.height() / h;
                Color color = source.get(sx, sy);
                target.set(tx, ty, color);
            }
        }

        source.show();
        target.show();
    }
}
