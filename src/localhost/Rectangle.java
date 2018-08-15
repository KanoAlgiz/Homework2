package localhost;

class Rectangle {
    private double x1, y1, x2, y2, minX, maxX, minY, maxY;

    Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.minX = Math.min(x1, x2);
        this.minY = Math.min(y1, y2);

        this.maxX = Math.max(x1, x2);
        this.maxY = Math.max(y1, y2);

    }

    double getSize() {

        return (this.maxX - this.minX) * (this.maxY - this.minY);
    }

    double getMinX() {

        return this.minX;
    }

    double getMinY() {

        return this.minY;
    }

    double getMaxX() {

        return this.maxX;
    }

    double getMaxY() {

        return this.maxY;
    }

    Rectangle getOverlapArea(Rectangle other) {
        double newX1, newY1, newX2, newY2;

        newX1 = Math.min(this.maxX, other.getMaxX());
        newX2 = Math.max(this.minX, other.getMinX());
        newY1 = Math.min(this.maxY, other.getMaxY());
        newY2 = Math.max(this.minY, other.getMinY());

        return new Rectangle(newX1, newY1, newX2, newY2);
    }

    boolean overlaps(Rectangle other) {
        boolean xOverlaps = (other.getMaxX() <= maxX && other.getMaxX() >= minX) || (other.getMinX() <= maxX && other.getMinX() >= minX) || (other.getMinX() >= minX && other.getMaxX() <= maxX) || (other.getMinX() <= minX && other.getMaxX() >= maxX);
        boolean yOverlaps = (other.getMaxY() <= maxY && other.getMaxY() >= minY) || (other.getMinY() <= maxY && other.getMinY() >= minY) || (other.getMinY() >= minY && other.getMaxY() <= maxY) || (other.getMinY() <= minY && other.getMaxY() >= maxY);
        return xOverlaps && yOverlaps;
    }
}
