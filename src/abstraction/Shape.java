package abstraction;

import implementer.ColorInterface;

public abstract class Shape {
    protected ColorInterface color;

    protected Shape(ColorInterface color) {
        this.color = color;
    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
}


