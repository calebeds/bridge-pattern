package abstraction;

import implementer.ColorInterface;

public class Rectangle extends Shape {

    public Rectangle(ColorInterface color) {
        super(color);
    }

    //Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.println("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    //abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        int newBorder = border * increment;
        drawShape(newBorder);
    }
}
