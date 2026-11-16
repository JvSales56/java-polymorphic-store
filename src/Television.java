public final class Television extends Product {

    public Television() {
        super("Television", 2500.00);
    }

    @Override
    public String getCategory() {
        return "Television";
    }
}