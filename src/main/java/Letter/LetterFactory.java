package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 100.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /**
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        var letterA = new Rectangle(halfMaxWidth, halfStripeThickness);
        var leftBar = new Rectangle(halfMaxWidth/8, maxHeight);
        var rightBar = leftBar.clone();

        leftBar.rotate(leftBar.getCoords(), Math.toRadians(170));
        rightBar.rotate(rightBar.getCoords(), Math.toRadians(10));

        leftBar.translate(leftBar.getCoords(), new Point2d(halfMaxWidth/2, 0.0));
        rightBar.translate(rightBar.getCoords(), new Point2d(-halfMaxWidth/2, 0.0));

        letterA.add(leftBar).add(rightBar);

        return letterA;
    }

    /**
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        var letterB = new Rectangle(halfMaxWidth/2, maxHeight);
        letterB.translate(letterB.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        var hollowCircle = new Circle(maxHeight/4);
        hollowCircle.remove(new Circle(maxHeight/5));
        var topCircle = hollowCircle.clone();

        hollowCircle.translate(hollowCircle.getCoords(), new Point2d(0.0, halfMaxWidth*1.25));
        topCircle.translate(topCircle.getCoords(), new Point2d(0.0, -halfMaxWidth*1.25));

        letterB.add(hollowCircle);
        letterB.add(topCircle);

        return letterB;
    }

    /**
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        var letterC = new Ellipse(maxWidth, maxHeight).remove(new Ellipse(maxWidth*0.9, maxHeight*0.9));

        var blockRemove = new Square(maxHeight/1.5);
        blockRemove.translate(blockRemove.getCoords(), new Point2d(halfMaxWidth, 0.0));
        letterC.remove(blockRemove);

        return letterC;
    }

    /**
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        var letterE = new Rectangle(halfMaxWidth/4, maxHeight);

        var midBar = new Rectangle(maxWidth*0.8, halfMaxHeight/8);
        letterE.translate(letterE.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        var topBar = midBar.clone();
        topBar.translate(topBar.getCoords(), new Point2d(0.0, -maxHeight/2.15));
        var bottomBar = midBar.clone();
        bottomBar.translate(bottomBar.getCoords(), new Point2d(0.0, maxHeight/2.1));

        letterE.add(topBar);
        letterE.add(bottomBar);
        letterE.add(midBar);

        return letterE;
    }

    /**
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        var letterH = new Rectangle(halfMaxWidth/4, maxHeight);
        var rightBar = letterH.clone();

        var midBar = new Rectangle(maxWidth*0.8, halfMaxHeight/8);

        letterH.translate(letterH.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        rightBar.translate(rightBar.getCoords(), new Point2d(halfMaxWidth, 0.0));

        letterH.add(rightBar);
        letterH.add(midBar);

        return letterH;
    }

    /**
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        var letterN = new Rectangle(halfMaxWidth/4, maxHeight);
        var rightBar = letterN.clone();

        var midBar = new Rectangle(halfMaxWidth/4, maxHeight*1.05);

        letterN.translate(letterN.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        rightBar.translate(rightBar.getCoords(), new Point2d(halfMaxWidth, 0.0));
        midBar.rotate(midBar.getCoords(), Math.toRadians(160));

        letterN.add(rightBar);
        letterN.add(midBar);

        return letterN;
    }

    /**
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new Ellipse(maxWidth, maxHeight).remove(new Ellipse(maxWidth*0.9, maxHeight*0.9));
    }

}
