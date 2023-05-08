import abstraction.Rectangle;
import abstraction.Shape;
import abstraction.Triangle;
import implementer.ColorInterface;
import implementer.GreenColor;
import implementer.RedColor;

public class Client {
    public static void main(String[] args) {
        System.out.println("******BRIDGE PATTERN******");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\nColoring Rectangle");
        ColorInterface red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);
    }
}
