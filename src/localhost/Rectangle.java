package localhost;

class Rectangle {
    private double minX, maxX, minY, maxY;
    /*
    New Rectangle constructor. Also calculates maximum and minimum coordinates on both axis.
     */
    Rectangle(double x1, double y1, double x2, double y2) {

        minX = Math.min(x1, x2);
        minY = Math.min(y1, y2);

        maxX = Math.max(x1, x2);
        maxY = Math.max(y1, y2);

    }

    double getSize() {

        return (maxX - minX) * (maxY - minY);

    }

    private double getMinX() {

        return minX;
    }

    private double getMinY() {

        return minY;
    }

    private double getMaxX() {

        return maxX;
    }

    private double getMaxY() {

        return maxY;
    }

    /*
    Returns new Rectangle instance - overlap area of two parent rectangles.
    Please use 'overlaps' check first!
     */
    Rectangle getOverlapArea(Rectangle other) {
        double newX1, newY1, newX2, newY2;

        newX1 = Math.min(maxX, other.getMaxX());
        newX2 = Math.max(minX, other.getMinX());
        newY1 = Math.min(maxY, other.getMaxY());
        newY2 = Math.max(minY, other.getMinY());

        return new Rectangle(newX1, newY1, newX2, newY2);
    }

    /*
    Check if provided Rectangle overlaps current Rectangle by comparing y and x coordinates of their corners.
     */
    boolean overlaps(Rectangle other) {
        boolean xOverlaps = (other.getMaxX() <= maxX && other.getMaxX() >= minX) || (other.getMinX() <= maxX && other.getMinX() >= minX) || (other.getMinX() >= minX && other.getMaxX() <= maxX) || (other.getMinX() <= minX && other.getMaxX() >= maxX);
        boolean yOverlaps = (other.getMaxY() <= maxY && other.getMaxY() >= minY) || (other.getMinY() <= maxY && other.getMinY() >= minY) || (other.getMinY() >= minY && other.getMaxY() <= maxY) || (other.getMinY() <= minY && other.getMaxY() >= maxY);
        return xOverlaps && yOverlaps;
    }
}
