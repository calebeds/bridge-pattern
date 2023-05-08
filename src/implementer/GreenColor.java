package implementer;

public class GreenColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green Color with " + border + " inch border.");
    }
}
