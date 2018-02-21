/**
 * This program displays the colors entered in RGB format
 *  on the command line in the familiar format developed
 *  in the 1960s by the color theorist Josef Albers that
 *  revolutionized the way that people think about color
 *  colors to try  0 174 239  147 149 252
 */
import com.sedgewick.stdlib.*;

import java.awt.Color;

public class AlbersSquares {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(800, 800);

        // first color
        int r1 = StdIn.readInt();
        int g1 = StdIn.readInt();
        int b1 = StdIn.readInt();
        Color c1 = new Color(r1, g1, b1);

        // second color
        int r2 = StdIn.readInt();
        int g2 = StdIn.readInt();
        int b2 = StdIn.readInt();
        Color c2 = new Color(r2, g2, b2);

        // first Albers square
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.25, .5, .2);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.25, .5, .1);

        // second Albers square
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.75, .5, .2);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.75, .5, .1);
    }
}
