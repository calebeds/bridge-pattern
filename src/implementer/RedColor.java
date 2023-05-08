package implementer;

public class RedColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red Color with " + border + " inch border.");
    }
}
