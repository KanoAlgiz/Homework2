package localhost;

public class Main {

    public static void main(String[] args) {
        Rectangle first = new Rectangle(40, 20, 5, 35);
        Rectangle second = new Rectangle(30, 10, 15, 45);

        System.out.println(first.getSize());
        System.out.println(second.getSize());

        if (first.overlaps(second)) {
            Rectangle third = first.getOverlapArea(second);
            System.out.println(third.getSize());
        } else {
            System.out.println(0);
        }
    }
}
