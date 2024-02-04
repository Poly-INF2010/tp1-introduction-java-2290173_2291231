package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {

        double a = widthDiameter / 2;
        double b = heightDiameter / 2;

        double perimetre = 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
        double step = 2 * Math.PI / (perimetre / 0.5);

        for (double angle = 0; angle < 2 * Math.PI; angle += step) {
            double x = a * Math.cos(angle);
            double y = b * Math.sin(angle);
            this.add(new Point2d(x, y));
        }

        for (double y = -b + 0.5; y < b; y += 0.5) {
            for (double x = -a + 0.5; x < a; x += 0.5) {
                if ((x * x) / (a * a) + (y * y) / (b * b) <= 1.0) {
                    this.add(new Point2d(x, y));
                }
            }
        }
    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {

    }

    /**
     * TODO
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
