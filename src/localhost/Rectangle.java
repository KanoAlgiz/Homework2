package localhost;

public class Rectangle {
    private double x1, y1, x2, y2, minx, maxx, miny, maxy;

    Rectangle(double setx1, double sety1, double setx2, double sety2){
        x1 = setx1;
        y1 = sety1;
        x2 = setx2;
        y2 = sety2;
        if (y1 > y2){
            maxy = y1;
            miny = y2;
        } else {
            maxy = y2;
            miny = y1;
        }

        if (x1 > x2){
            maxx = x1;
            minx = x2;
        } else {
            maxx = x2;
            minx = x1;
        }
    }

    double getSize(){
        return (maxx - minx) * (maxy - miny);
    }

    double getMinx(){
        return minx;
    }

    double getMiny(){
        return miny;
    }

    double getMaxx(){
        return maxx;
    }

    double getMaxy(){
        return maxy;
    }

    Rectangle getOverlapArea(Rectangle other){
        double newx1, newy1, newx2, newy2;

        newx1 = maxx > other.getMaxx() ? other.getMaxx() : maxx;
        newx2 = minx < other.getMinx() ? other.getMinx() : minx;
        newy1 = maxy > other.getMaxy() ? other.getMaxy() : maxy;
        newy2 = miny < other.getMiny() ? other.getMiny() : miny;

        return new Rectangle(newx1, newy1, newx2, newy2);
    }

    boolean overlaps(Rectangle other){
        boolean xbetween = (other.maxx <= maxx && other.maxx >= minx) || (other.minx <= maxx && other.minx >= minx);
        boolean ybetween = (other.maxy <= maxy && other.maxy >= miny) || (other.miny <= maxy && other.miny >= miny);
        return xbetween && ybetween;
    }
}
