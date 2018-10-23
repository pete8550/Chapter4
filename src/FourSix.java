public class FourSix {

    public static void main(String[] args) {

        //Radius is
        final double radius = 40;

        System.out.println("Three random points are ");

        //Point 1
        double angle = Math.random() * 360;
        double x = radius * Math.cos(angle * Math.PI / 180);
        double y = radius * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");

        //Point 2
        angle = Math.random() * 360;
        x = radius * Math.cos(angle * Math.PI / 180);
        y = radius * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");

        //Point 3
        angle = Math.random() * 360;
        x = radius * Math.cos(angle * Math.PI / 180);
        y = radius * Math.sin(angle * Math.PI / 180);
        System.out.println("(" + x + ", " + y + ")");
    }
}
