package localhost;

class Rectangle {
    private double x1, y1, x2, y2, minX, maxX, minY, maxY;

    Rectangle(double setX1, double setY1, double setX2, double setY2) {
        x1 = setX1;
        y1 = setY1;
        x2 = setX2;
        y2 = setY2;
        if (y1 > y2) {
            maxY = y1;
            minY = y2;
        } else {
            maxY = y2;
            minY = y1;
        }

        if (x1 > x2) {
            maxX = x1;
            minX = x2;
        } else {
            maxX = x2;
            minX = x1;
        }
    }

    double getSize() {
        return (maxX - minX) * (maxY - minY);
    }

    double getMinx() {
        return minX;
    }

    double getMiny() {
        return minY;
    }

    double getMaxx() {
        return maxX;
    }

    double getMaxy() {
        return maxY;
    }

    Rectangle getOverlapArea(Rectangle other) {
        double newx1, newy1, newx2, newy2;

        newx1 = maxX > other.getMaxx() ? other.getMaxx() : maxX;
        newx2 = minX < other.getMinx() ? other.getMinx() : minX;
        newy1 = maxY > other.getMaxy() ? other.getMaxy() : maxY;
        newy2 = minY < other.getMiny() ? other.getMiny() : minY;

        return new Rectangle(newx1, newy1, newx2, newy2);
    }

    boolean overlaps(Rectangle other) {
        boolean xOverlaps = (other.getMaxx() <= maxX && other.getMaxx() >= minX) || (other.getMinx() <= maxX && other.getMinx() >= minX) || (other.getMinx() >= minX && other.getMaxx() <= maxX) || (other.getMinx() <= minX && other.getMaxx() >= maxX);
        boolean yOverlaps = (other.getMaxy() <= maxY && other.getMaxy() >= minY) || (other.getMiny() <= maxY && other.getMiny() >= minY) || (other.getMiny() >= minY && other.getMaxy() <= maxY) || (other.getMiny() <= minY && other.getMaxy() >= maxY);
        return xOverlaps && yOverlaps;
    }
}
