package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {

        double b = heightDiameter / 2;

         for (double a = widthDiameter / 2; a > 0 && b > 0; a -= 0.5){

             double perimetre = widthDiameter * Math.PI;
             int step = (int) (2 * Math.PI / perimetre / 0.5);

             for (double angle = 0; angle < 2 * Math.PI; angle += step){
                 this.add(new Point2d(Math.cos(angle) * a, Math.sin(angle) * b));
             }
             b -= 0.5;
         }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {

    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
